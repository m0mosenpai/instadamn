package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.FfF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35165FfF {
    public final InterfaceC02550Ad A00;

    public static void A01(InterfaceC02590Ai interfaceC02590Ai, InterfaceC11380iw interfaceC11380iw, InterfaceC83713oG interfaceC83713oG, Boolean bool, Long l) {
        interfaceC02590Ai.A9K(AbstractC111324zv.A00(174), l);
        interfaceC02590Ai.A9K(AbstractC111324zv.A00(50), AbstractC92784Dr.A01(interfaceC83713oG));
        interfaceC02590Ai.AAP("open_thread_id", AbstractC92784Dr.A02(interfaceC83713oG));
        interfaceC02590Ai.AAP("module", interfaceC11380iw.getModuleName());
        interfaceC02590Ai.A7v("is_e2ee", bool);
        interfaceC02590Ai.Cht();
    }

    public final void A02(InterfaceC11380iw interfaceC11380iw, InterfaceC83733oI interfaceC83733oI, Boolean bool, long j) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) this.A00, "direct_thread_mute_button");
        if (A0f.isSampled()) {
            A0f.A9K("mute_duration", Long.valueOf(j));
            A01(A0f, interfaceC11380iw, interfaceC83733oI, bool, A00(A0f, interfaceC83733oI));
        }
    }

    public final void A03(InterfaceC11380iw interfaceC11380iw, InterfaceC83733oI interfaceC83733oI, Boolean bool, long j) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) this.A00, "direct_thread_video_call_mute_button");
        if (A0f.isSampled()) {
            A0f.A9K("mute_duration", Long.valueOf(j));
            A01(A0f, interfaceC11380iw, interfaceC83733oI, bool, A00(A0f, interfaceC83733oI));
        }
    }

    public final void A04(InterfaceC11380iw interfaceC11380iw, InterfaceC83733oI interfaceC83733oI, Boolean bool, boolean z) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) this.A00, "direct_thread_mute_button");
        if (A0f.isSampled()) {
            A0f.A7v("to_mute", Boolean.valueOf(z));
            A01(A0f, interfaceC11380iw, interfaceC83733oI, bool, A00(A0f, interfaceC83733oI));
        }
    }

    public final void A05(InterfaceC11380iw interfaceC11380iw, InterfaceC83733oI interfaceC83733oI, Boolean bool, boolean z) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) this.A00, "direct_thread_mentions_mute_button");
        if (A0f.isSampled()) {
            A0f.A7v("to_mute", Boolean.valueOf(z));
            AbstractC31171DnF.A1F(A0f, AbstractC1345466e.A06(interfaceC83733oI));
            AbstractC31175DnJ.A14(A0f, interfaceC11380iw);
            A0f.A7v("is_e2ee", bool);
            A0f.Cht();
        }
    }

    public final void A06(InterfaceC11380iw interfaceC11380iw, InterfaceC83733oI interfaceC83733oI, Boolean bool, boolean z) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) this.A00, "direct_thread_video_call_mute_button");
        if (A0f.isSampled()) {
            A0f.A7v("to_mute", Boolean.valueOf(z));
            A01(A0f, interfaceC11380iw, interfaceC83733oI, bool, A00(A0f, interfaceC83733oI));
        }
    }

    public C35165FfF(InterfaceC02550Ad interfaceC02550Ad) {
        this.A00 = interfaceC02550Ad;
    }

    public static Long A00(InterfaceC02590Ai interfaceC02590Ai, InterfaceC83733oI interfaceC83733oI) {
        interfaceC02590Ai.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, AbstractC1345466e.A06(interfaceC83733oI));
        MsysThreadId A04 = AbstractC1345466e.A04(interfaceC83733oI);
        if (A04 != null) {
            return Long.valueOf(A04.A00);
        }
        return null;
    }
}
