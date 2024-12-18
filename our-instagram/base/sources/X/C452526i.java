package X;

import com.instagram.realtimeclient.bugreport.RealtimeLogsProvider;

/* renamed from: X.26i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C452526i implements InterfaceC449925e, InterfaceC13000lm {
    public C83403nh A00;
    public C2EC A01;

    @Override // X.InterfaceC449925e
    public final String getFilenamePrefix() {
        return "direct_visual_message_log";
    }

    @Override // X.InterfaceC449925e
    public final String getFilenameSuffix() {
        return RealtimeLogsProvider.LOG_SUFFIX;
    }

    @Override // X.InterfaceC449925e
    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    @Override // X.InterfaceC449925e
    public final String getTag() {
        return "DirectVisualMessageBugReportLogger";
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r1 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (r0 == false) goto L31;
     */
    @Override // X.InterfaceC449925e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getContentInBackground(android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C452526i.getContentInBackground(android.content.Context):java.lang.String");
    }
}
