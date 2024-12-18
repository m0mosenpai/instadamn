package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.creator.agent.settings.facts.viewmodel.AddFactUseCase;
import com.instagram.creator.agent.settings.facts.viewmodel.LinkPreviewUseCaseImpl;
import com.instagram.creator.agent.settings.facts.viewmodel.QuestionAnswerFactPreviewUseCaseImpl;
import com.instagram.creator.agent.settings.facts.viewmodel.SingularFactPreviewUseCaseImpl;

/* renamed from: X.Brm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26765Brm extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AddFactFragment";
    public final String A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        int i;
        C14360o3.A0B(interfaceC56362iU, 0);
        InterfaceC09390do interfaceC09390do = this.A07;
        Object value = interfaceC09390do.getValue();
        EnumC27380C6j enumC27380C6j = EnumC27380C6j.A03;
        if (value == enumC27380C6j && AbstractC25225BEi.A15(this.A05).length() == 0) {
            i = 2131957022;
        } else if (interfaceC09390do.getValue() == enumC27380C6j && AbstractC25225BEi.A15(this.A05).length() > 0) {
            i = 2131957024;
        } else if (interfaceC09390do.getValue() == EnumC27380C6j.A05 && this.A04.getValue() != null) {
            i = 2131957025;
        } else {
            Object value2 = interfaceC09390do.getValue();
            EnumC27380C6j enumC27380C6j2 = EnumC27380C6j.A04;
            if (value2 == enumC27380C6j2 && this.A04.getValue() == null) {
                i = 2131957032;
            } else if (interfaceC09390do.getValue() == enumC27380C6j2 && this.A04.getValue() != null) {
                i = 2131957078;
            } else {
                Object value3 = interfaceC09390do.getValue();
                i = 2131957023;
                if (value3 == EnumC27380C6j.A02) {
                    i = 2131957088;
                }
            }
        }
        interfaceC56362iU.Efu(i);
        interfaceC56362iU.EkS(true);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A08);
    }

    public C26765Brm() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A06 = AbstractC25235BEs.A0s("", this, AbstractC111324zv.A00(199), enumC09460dv, 42);
        this.A05 = AbstractC25235BEs.A0s("", this, AbstractC111324zv.A00(380), enumC09460dv, 43);
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new D60(this));
        this.A07 = AbstractC25235BEs.A0s(EnumC27380C6j.A05, this, "creator_ai_add_fact_content_type", enumC09460dv, 44);
        this.A02 = DH6.A01(this, "creator_ai_creator_fbid", enumC09460dv, 39);
        this.A03 = DH6.A01(this, "creator_ai_entry_point_extra", enumC09460dv, 40);
        this.A00 = "add_fact_fragment";
        this.A08 = AbstractC60492pY.A02(this);
        this.A01 = C29908DGw.A00(this, 18);
        this.A09 = C29908DGw.A00(this, 19);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        C05A c05a;
        C26084BgD c26084BgD;
        int i;
        LinkPreviewUseCaseImpl linkPreviewUseCaseImpl;
        LinkPreviewUseCaseImpl linkPreviewUseCaseImpl2;
        int A02 = C0f9.A02(1647299384);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        String str3 = null;
        if (bundle2 != null) {
            str = bundle2.getString(AbstractC111324zv.A00(382));
        } else {
            str = null;
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            str2 = bundle3.getString(AbstractC111324zv.A00(381));
        } else {
            str2 = null;
        }
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            str3 = bundle4.getString(AbstractC111324zv.A00(198));
        }
        C26901Bu4 c26901Bu4 = (C26901Bu4) this.A09.getValue();
        String A15 = AbstractC25225BEi.A15(this.A04);
        String A152 = AbstractC25225BEi.A15(this.A06);
        String A153 = AbstractC25225BEi.A15(this.A05);
        String A154 = AbstractC25225BEi.A15(this.A03);
        AbstractC167017dG.A1S(A152, A153);
        AddFactUseCase addFactUseCase = c26901Bu4.A00;
        addFactUseCase.A04.Egh(addFactUseCase.A03);
        addFactUseCase.A06(A152, A153);
        addFactUseCase.A02 = A15;
        addFactUseCase.A01 = A154;
        if (str != null && str3 != null) {
            if (str2 == null) {
                str2 = "";
            }
            addFactUseCase.A00 = new C45116Jxl(str3, str2, str, 8);
        }
        AbstractC26895Btw abstractC26895Btw = c26901Bu4.A02;
        if (abstractC26895Btw instanceof SingularFactPreviewUseCaseImpl) {
            SingularFactPreviewUseCaseImpl singularFactPreviewUseCaseImpl = (SingularFactPreviewUseCaseImpl) abstractC26895Btw;
            i = 0;
            singularFactPreviewUseCaseImpl.A00 = A15;
            c05a = singularFactPreviewUseCaseImpl.A02;
            linkPreviewUseCaseImpl2 = singularFactPreviewUseCaseImpl;
        } else if (abstractC26895Btw instanceof QuestionAnswerFactPreviewUseCaseImpl) {
            QuestionAnswerFactPreviewUseCaseImpl questionAnswerFactPreviewUseCaseImpl = (QuestionAnswerFactPreviewUseCaseImpl) abstractC26895Btw;
            i = 0;
            questionAnswerFactPreviewUseCaseImpl.A00 = A15;
            c05a = questionAnswerFactPreviewUseCaseImpl.A02;
            linkPreviewUseCaseImpl2 = questionAnswerFactPreviewUseCaseImpl;
        } else {
            LinkPreviewUseCaseImpl linkPreviewUseCaseImpl3 = (LinkPreviewUseCaseImpl) abstractC26895Btw;
            linkPreviewUseCaseImpl3.A00 = A15;
            c05a = linkPreviewUseCaseImpl3.A03;
            c26084BgD = linkPreviewUseCaseImpl3.A01;
            linkPreviewUseCaseImpl = linkPreviewUseCaseImpl3;
            c05a.Egh(c26084BgD);
            linkPreviewUseCaseImpl.A06(A152, A153);
            C0f9.A09(1130467418, A02);
        }
        c26084BgD = new C26084BgD(i, 7);
        linkPreviewUseCaseImpl = linkPreviewUseCaseImpl2;
        c05a.Egh(c26084BgD);
        linkPreviewUseCaseImpl.A06(A152, A153);
        C0f9.A09(1130467418, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-704108039);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30497Dbg(AbstractC25225BEi.A07(C06090Tz.A05, AbstractC166987dD.A0o(this.A08), 36604404241208389L), 3, this), -404630534);
        C0f9.A09(-693761345, A02);
        return A00;
    }
}
