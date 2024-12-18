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
public final class DeadCodeFunctionMutationResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes.dex */
    public final class XdtUploadFunctionIds extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return new C4OU(new C4OM[]{new C4OW(C95124Py.A00, "success")});
        }

        public XdtUploadFunctionIds() {
            super(1175684904);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return new C4OU(new C4OM[]{new C4OK(C4OO.A01(), XdtUploadFunctionIds.class, "xdt_upload_function_ids(request_data:{\"device_os_version\":$device_os_version,\"function_ids\":$function_ids,\"process_name\":$process_name,\"session_id\":$session_id})", 1175684904)});
    }

    public DeadCodeFunctionMutationResponseImpl() {
        super(-627618945);
    }
}
