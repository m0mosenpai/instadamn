package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.7LR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7LR {
    public final C18920wW A00;
    public final InterfaceC16820sZ A01;
    public final C7LQ A02;

    public C7LR(C18920wW c18920wW, C7LQ c7lq, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(c18920wW, 1);
        this.A00 = c18920wW;
        this.A01 = interfaceC16820sZ;
        this.A02 = c7lq;
    }

    public final void A00(C7YT c7yt, C83693oE c83693oE, InterfaceC83733oI interfaceC83733oI) {
        String A07;
        Long l;
        String str;
        Long l2;
        Long l3 = null;
        String str2 = null;
        boolean z = interfaceC83733oI instanceof MsysThreadId;
        if (z) {
            MsysThreadId A04 = AbstractC1345466e.A04(interfaceC83733oI);
            if (A04 != null) {
                l2 = Long.valueOf(A04.A00);
            } else {
                l2 = null;
            }
            if (c83693oE != null) {
                str2 = AbstractC1345466e.A07(c83693oE);
            }
            A07 = str2;
            l3 = l2;
        } else {
            A07 = AbstractC1345466e.A07(interfaceC83733oI);
        }
        String str3 = (String) this.A01.invoke();
        if (str3 != null) {
            l = AbstractC003100w.A0k(10, str3);
        } else {
            l = null;
        }
        Integer num = c7yt.A00;
        Integer num2 = c7yt.A01;
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_shh_mode_enter");
        if (1 - num.intValue() != 0) {
            str = "SWIPE";
        } else {
            str = "TAP";
        }
        A00.AAP("action", str);
        A00.A7v("is_e2ee", Boolean.valueOf(z));
        A00.AAP("open_thread_id", A07);
        A00.A9K("consistent_thread_fbid", l3);
        A00.A9K("recipient_id", l);
        A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, num2 != null ? "MESSAGE" : null);
        A00.Cht();
    }
}
