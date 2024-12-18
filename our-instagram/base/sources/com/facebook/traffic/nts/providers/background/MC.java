package com.facebook.traffic.nts.providers.background;

import com.facebook.mobileconfig.MobileConfigLegacyLocalConfigIds;
import com.facebook.mobileconfig.MobileConfigParams0;
import com.facebook.mobileconfig.MobileConfigParams1;
import com.facebook.mobileconfig.MobileConfigParams2;
import com.facebook.mobileconfig.MobileConfigParams3;

/* loaded from: classes12.dex */
public final class MC {
    public static final MC INSTANCE = new Object();

    /* loaded from: classes10.dex */
    public final class fb_android_traffic_nts_background_scheduler {
        public static final int CONFIG_ID = 75906;
        public static final fb_android_traffic_nts_background_scheduler INSTANCE = new Object();
        public static final int __CONFIG__ = MobileConfigLegacyLocalConfigIds.fb_android_traffic_nts_background_scheduler;
        public static final long async_background_job_enabled = MobileConfigParams3.fb_android_traffic_nts_background_scheduler_async_background_job_enabled;
        public static final long execute_if_idle_enabled = MobileConfigParams0.fb_android_traffic_nts_background_scheduler_execute_if_idle_enabled;
        public static final long reschedule_on_execute_enabled = MobileConfigParams2.fb_android_traffic_nts_background_scheduler_reschedule_on_execute_enabled;
        public static final long scheduling_alignment_interval_seconds = MobileConfigParams2.fb_android_traffic_nts_background_scheduler_scheduling_alignment_interval_seconds;
        public static final long execute_if_network_connected_enabled = MobileConfigParams0.fb_android_traffic_nts_background_scheduler_execute_if_network_connected_enabled;
        public static final long dowork_timeout_await_scheduler_seconds = MobileConfigParams3.fb_android_traffic_nts_background_scheduler_dowork_timeout_await_scheduler_seconds;
        public static final long dowork_verify_nts_manager_enabled = MobileConfigParams0.fb_android_traffic_nts_background_scheduler_dowork_verify_nts_manager_enabled;
        public static final long dowork_verify_nts_scheduler_enabled = MobileConfigParams2.fb_android_traffic_nts_background_scheduler_dowork_verify_nts_scheduler_enabled;
    }

    /* loaded from: classes10.dex */
    public final class fb_android_traffic_nts_manager {
        public static final int CONFIG_ID = 69786;
        public static final fb_android_traffic_nts_manager INSTANCE = new Object();
        public static final int __CONFIG__ = MobileConfigLegacyLocalConfigIds.fb_android_traffic_nts_manager;
        public static final long init_services_enabled = MobileConfigParams2.fb_android_traffic_nts_manager_init_services_enabled;
        public static final long enable_tasos = MobileConfigParams3.fb_android_traffic_nts_manager_enable_tasos;
        public static final long enable_tigon_provider = MobileConfigParams2.fb_android_traffic_nts_manager_enable_tigon_provider;
        public static final long enable_common_providers = MobileConfigParams3.fb_android_traffic_nts_manager_enable_common_providers;
        public static final long enable_background_scheduler = MobileConfigParams3.fb_android_traffic_nts_manager_enable_background_scheduler;
        public static final long enable_reachability_v2_provider = MobileConfigParams3.fb_android_traffic_nts_manager_enable_reachability_v2_provider;
        public static final long enable_mobile_probing = MobileConfigParams3.fb_android_traffic_nts_manager_enable_mobile_probing;
        public static final long enable_xanalytics_provider = MobileConfigParams1.fb_android_traffic_nts_manager_enable_xanalytics_provider;
        public static final long enable_netseer = MobileConfigParams3.fb_android_traffic_nts_manager_enable_netseer;
        public static final long enable_startup_signals_provider = MobileConfigParams2.fb_android_traffic_nts_manager_enable_startup_signals_provider;
        public static final long enable_ip_assoc = MobileConfigParams0.fb_android_traffic_nts_manager_enable_ip_assoc;
        public static final long enable_http_request_interceptor_provider = MobileConfigParams1.fb_android_traffic_nts_manager_enable_http_request_interceptor_provider;
        public static final long enable_app_fg_bg_state_provider = MobileConfigParams0.fb_android_traffic_nts_manager_enable_app_fg_bg_state_provider;
        public static final long init_background_scheduler_on_create = MobileConfigParams3.fb_android_traffic_nts_manager_init_background_scheduler_on_create;
    }
}
