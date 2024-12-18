package com.facebook.analytics2.logger.legacy.uploader;

import X.C88733xZ;
import X.C89093yB;
import X.C89103yC;
import X.InterfaceC38001pk;
import java.io.IOException;

/* loaded from: classes2.dex */
public class PrivacyControlledUploader implements InterfaceC38001pk {
    public static final IOException A02 = new IOException("Upload is skipped due to privacy control.");
    public C88733xZ A00;
    public InterfaceC38001pk A01;

    @Override // X.InterfaceC38001pk
    public final void FDA(C89103yC c89103yC, C89093yB c89093yB) {
        this.A01.FDA(c89103yC, c89093yB);
    }
}
