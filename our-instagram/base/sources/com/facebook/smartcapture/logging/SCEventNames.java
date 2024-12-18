package com.facebook.smartcapture.logging;

/* loaded from: classes10.dex */
public interface SCEventNames {
    public static final String BUTTON_CLICK = "button_click";
    public static final String CAMERA_INITIALIZE = "camera_initialize";
    public static final String CAPTURE_SESSION_END = "capture_session_end";
    public static final String CONSENT_DISCLAIMER_LEARN_MORE_CLICK = "consent_disclaimer_learn_more_click";
    public static final String CONSENT_DISCLAIMER_SHOWN_AS_GRANTED = "consent_disclaimer_shown_as_granted";
    public static final String CONSENT_DISCLAIMER_SHOWN_AS_WITHDRAWN = "consent_disclaimer_shown_as_withdrawn";
    public static final String CONSENT_PICKER_LEARN_MORE_CLICK = "consent_picker_learn_more_click";
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String DOCUPLOAD_CANCELLED = "docupload_cancelled";
    public static final String DOCUPLOAD_FAILED = "docupload_failed";
    public static final String DOCUPLOAD_STARTED = "docupload_started";
    public static final String DOCUPLOAD_SUCCESS = "docupload_success";
    public static final String FLOW_CANCEL = "flow_cancel";
    public static final String FLOW_END = "flow_end";
    public static final String FLOW_START = "flow_start";
    public static final String LOCALE_MISMATCH = "locale_mismatch";
    public static final String PERMISSION_EXPLAIN = "permission_explain";
    public static final String PERMISSION_GRANT = "permission_grant";
    public static final String PERMISSION_NEVER_ASK_AGAIN = "permission_never_ask_again";
    public static final String PERMISSION_REJECT = "permission_reject";
    public static final String STEP_CHANGE = "step_change";
    public static final String UPLOAD_FAILED = "upload_failed";
    public static final String UPLOAD_STARTED = "upload_started";
    public static final String UPLOAD_SUCCESS = "upload_success";

    /* loaded from: classes10.dex */
    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Object();
        public static final String BUTTON_CLICK = "button_click";
        public static final String CAMERA_INITIALIZE = "camera_initialize";
        public static final String CAPTURE_SESSION_END = "capture_session_end";
        public static final String CONSENT_DISCLAIMER_LEARN_MORE_CLICK = "consent_disclaimer_learn_more_click";
        public static final String CONSENT_DISCLAIMER_SHOWN_AS_GRANTED = "consent_disclaimer_shown_as_granted";
        public static final String CONSENT_DISCLAIMER_SHOWN_AS_WITHDRAWN = "consent_disclaimer_shown_as_withdrawn";
        public static final String CONSENT_PICKER_LEARN_MORE_CLICK = "consent_picker_learn_more_click";
        public static final String DOCUPLOAD_CANCELLED = "docupload_cancelled";
        public static final String DOCUPLOAD_FAILED = "docupload_failed";
        public static final String DOCUPLOAD_STARTED = "docupload_started";
        public static final String DOCUPLOAD_SUCCESS = "docupload_success";
        public static final String FLOW_CANCEL = "flow_cancel";
        public static final String FLOW_END = "flow_end";
        public static final String FLOW_START = "flow_start";
        public static final String LOCALE_MISMATCH = "locale_mismatch";
        public static final String PERMISSION_EXPLAIN = "permission_explain";
        public static final String PERMISSION_GRANT = "permission_grant";
        public static final String PERMISSION_NEVER_ASK_AGAIN = "permission_never_ask_again";
        public static final String PERMISSION_REJECT = "permission_reject";
        public static final String STEP_CHANGE = "step_change";
        public static final String UPLOAD_FAILED = "upload_failed";
        public static final String UPLOAD_STARTED = "upload_started";
        public static final String UPLOAD_SUCCESS = "upload_success";
    }

    /* loaded from: classes10.dex */
    public interface Params {
        public static final String BUTTON_NAME = "button_name";
        public static final String CAPTURE_END_HISTORY = "state_history";
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final String IMAGE_HEIGHT = "image_height";
        public static final String IMAGE_WIDTH = "image_width";
        public static final String PERMISSION_ATTEMPTS = "attempts";
        public static final String PREVIEW_HEIGHT = "preview_height";
        public static final String PREVIEW_WIDTH = "preview_width";
        public static final String SESSION_END_REASON = "cancel_reason";
        public static final String STEP_CHANGE_NEXT = "next";
        public static final String STEP_CHANGE_PREVIOUS = "previous";
        public static final String UPLOAD_INFRA = "upload_infra";
        public static final String VIEW_HEIGHT = "view_height";
        public static final String VIEW_WIDTH = "view_width";

        /* loaded from: classes10.dex */
        public final class Companion {
            public static final /* synthetic */ Companion $$INSTANCE = new Object();
            public static final String BUTTON_NAME = "button_name";
            public static final String CAPTURE_END_HISTORY = "state_history";
            public static final String IMAGE_HEIGHT = "image_height";
            public static final String IMAGE_WIDTH = "image_width";
            public static final String PERMISSION_ATTEMPTS = "attempts";
            public static final String PREVIEW_HEIGHT = "preview_height";
            public static final String PREVIEW_WIDTH = "preview_width";
            public static final String SESSION_END_REASON = "cancel_reason";
            public static final String STEP_CHANGE_NEXT = "next";
            public static final String STEP_CHANGE_PREVIOUS = "previous";
            public static final String UPLOAD_INFRA = "upload_infra";
            public static final String VIEW_HEIGHT = "view_height";
            public static final String VIEW_WIDTH = "view_width";
        }
    }
}
