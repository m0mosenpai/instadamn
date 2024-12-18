package com.facebook.smartcapture.docauth;

import com.facebook.smartcapture.diagnostic.DiagnosticInfo;

/* loaded from: classes10.dex */
public interface DocAuthManagerDelegate {
    void onDiagnosticInfoAvailable(DiagnosticInfo diagnosticInfo);

    void onDocAuthResultAvailable(DocAuthResult docAuthResult, int i);
}
