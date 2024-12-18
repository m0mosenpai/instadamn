package X;

import com.facebook.papaya.log.LogSink;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.Map;

/* renamed from: X.MyB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51969MyB extends LogSink {
    public final C18920wW A00;
    public final UserSession A01;

    @Override // com.facebook.papaya.log.LogSink
    public final void event(long j, long j2, long j3, int i, Map map, String str) {
    }

    @Override // com.facebook.papaya.log.LogSink
    public final void log(long j, long j2, long j3, int i, String str, int i2, String str2) {
        AbstractC25229BEm.A1I(str, 4, str2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "mldw_client_debug");
        if (A0f.isSampled()) {
            A0f.A9K("counter", Long.valueOf(j));
            A0f.A9K("timestamp", Long.valueOf(j2));
            A0f.A9K("level", MSX.A0a(A0f, Long.valueOf(j3), ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, i));
            A0f.AAP("file_name", str);
            A0f.A9K("file_line", AbstractC31171DnF.A0V(i2));
            A0f.AAP(DialogModule.KEY_MESSAGE, str2);
            A0f.Cht();
        }
    }

    public C51969MyB(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = AbstractC12220kQ.A02(userSession);
    }
}
