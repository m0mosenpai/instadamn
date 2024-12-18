package com.instagram.deadcodedetection;

import X.C2JS;
import X.C2JT;
import X.C4OK;
import X.C4OM;
import X.C4OO;
import X.C4OU;
import X.C4OW;
import X.C95124Py;

/* loaded from: classes.dex */
public final class DeadCodeClassMutationResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes.dex */
    public final class XdtUploadClassIds extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return new C4OU(new C4OM[]{new C4OW(C95124Py.A00, "success")});
        }

        public XdtUploadClassIds() {
            super(-1536997598);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return new C4OU(new C4OM[]{new C4OK(C4OO.A01(), XdtUploadClassIds.class, "xdt_upload_class_ids(request_data:{\"app_build_number\":$app_build_number,\"class_ids\":$class_ids,\"device_os_version\":$device_os_version,\"process_name\":$process_name,\"session_id\":$session_id})", -1536997598)});
    }

    public DeadCodeClassMutationResponseImpl() {
        super(211819059);
    }
}
