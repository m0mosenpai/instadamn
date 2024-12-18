package com.instagram.schools.management.data;

import X.AbstractC167017dG;
import X.C2JS;
import X.C2JT;
import X.C4OO;
import X.C4OU;
import X.C95124Py;

/* loaded from: classes10.dex */
public final class SendOtpMutationResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XdtSendOtpEmail extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0Z(C95124Py.A00, "success");
        }

        public XdtSendOtpEmail() {
            super(-1770356819);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0W(C4OO.A01(), XdtSendOtpEmail.class, "xdt_send_otp_email(input:$input)", -1770356819);
    }

    public SendOtpMutationResponseImpl() {
        super(1794722988);
    }
}
