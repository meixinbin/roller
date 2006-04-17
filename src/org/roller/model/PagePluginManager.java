/* Created on Nov. 26, 2005 */package org.roller.model;import java.util.Map;import java.io.Serializable;import org.apache.velocity.context.Context;import org.roller.pojos.WeblogEntryData;import org.roller.pojos.WebsiteData;/** * Manages Roller page plugins */public interface PagePluginManager extends Serializable {        /**      * Returns true if plugins are present      */    public boolean hasPagePlugins();        /**     * Create and init plugins for processing entries in a specified website.      * @param website        Website being processed      * @param servletContext ServetContext or null if running outside webapp     * @param contextURL     Absolute URL of webapp         * @param ctx            Velocity context      */    public Map createAndInitPagePlugins(            WebsiteData website,            Object servletContext,            String contextPath,            Context ctx);        /**     * Accepts weblog entry, creates copy, applies plugins to copy and     * returns the results.     * @param entry       Original weblog entry     * @param plugins     Map of plugins to apply     * @param str         String to which to apply plugins     * @param singleEntry Rendering for single entry page?     * @return        Copy of weblog entry with plugins applied     */    public String applyPagePlugins(       WeblogEntryData entry, Map pagePlugins, String str, boolean singleEntry);        /**      * Release all resources associated with Roller session.      */    public void release();      }