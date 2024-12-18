package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.Dx2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31749Dx2 extends ClickableSpan {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C31749Dx2(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        FragmentActivity requireActivity;
        AbstractC18680vv abstractC18680vv;
        C35133Fea c35133Fea;
        Context requireContext;
        InterfaceC09390do interfaceC09390do;
        AbstractC12990ll A0o;
        Context requireContext2;
        String str;
        EMT emt;
        switch (this.A00) {
            case 0:
                G34 g34 = (G34) this.A01;
                AbstractC34910FZw.A00(g34.A00, g34.A01, this.A02);
                return;
            case 1:
                EKV ekv = (EKV) this.A01;
                requireActivity = ekv.requireActivity();
                abstractC18680vv = ekv.A00;
                SimpleWebViewActivity.A00(requireActivity, abstractC18680vv, new SimpleWebViewConfig(AbstractC31171DnF.A0R(this.A02)));
                return;
            case 2:
                C32257EIr c32257EIr = (C32257EIr) this.A01;
                requireActivity = c32257EIr.requireActivity();
                abstractC18680vv = c32257EIr.A01;
                SimpleWebViewActivity.A00(requireActivity, abstractC18680vv, new SimpleWebViewConfig(AbstractC31171DnF.A0R(this.A02)));
                return;
            case 3:
                EL2 el2 = (EL2) this.A01;
                requireActivity = el2.requireActivity();
                abstractC18680vv = el2.A02;
                SimpleWebViewActivity.A00(requireActivity, abstractC18680vv, new SimpleWebViewConfig(AbstractC31171DnF.A0R(this.A02)));
                return;
            case 4:
                c35133Fea = SimpleWebViewActivity.A02;
                EMT emt2 = (EMT) this.A01;
                requireContext = emt2.requireContext();
                interfaceC09390do = emt2.A06;
                emt = emt2;
                A0o = AbstractC166987dD.A0o(interfaceC09390do);
                requireContext2 = emt.requireContext();
                str = "https://help.instagram.com/574047304429005/?ref=learn_more";
                c35133Fea.A02(requireContext, A0o, new SimpleWebViewConfig((String) null, (String) null, true, false, false, false, false, true, false, false, true, false, false, false, this.A02, AbstractC63260SgI.A01(requireContext2, str)));
                return;
            case 5:
                c35133Fea = SimpleWebViewActivity.A02;
                C32323ELr c32323ELr = (C32323ELr) this.A01;
                requireContext = c32323ELr.requireContext();
                A0o = AbstractC166987dD.A0o(c32323ELr.A04);
                requireContext2 = c32323ELr.requireContext();
                str = "https://help.instagram.com/227486307449481";
                c35133Fea.A02(requireContext, A0o, new SimpleWebViewConfig((String) null, (String) null, true, false, false, false, false, true, false, false, true, false, false, false, this.A02, AbstractC63260SgI.A01(requireContext2, str)));
                return;
            case 6:
                c35133Fea = SimpleWebViewActivity.A02;
                EMR emr = (EMR) this.A01;
                requireContext = emr.requireContext();
                interfaceC09390do = emr.A06;
                emt = emr;
                A0o = AbstractC166987dD.A0o(interfaceC09390do);
                requireContext2 = emt.requireContext();
                str = "https://help.instagram.com/574047304429005/?ref=learn_more";
                c35133Fea.A02(requireContext, A0o, new SimpleWebViewConfig((String) null, (String) null, true, false, false, false, false, true, false, false, true, false, false, false, this.A02, AbstractC63260SgI.A01(requireContext2, str)));
                return;
            default:
                C12260kU.A0G(((C70169WEl) this.A01).A04, AbstractC08820cl.A03(this.A02));
                return;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        boolean z;
        switch (this.A00) {
            case 4:
            case 5:
            case 6:
                z = false;
                C14360o3.A0B(textPaint, 0);
                super.updateDrawState(textPaint);
                break;
            case 7:
                z = false;
                break;
            default:
                super.updateDrawState(textPaint);
                return;
        }
        textPaint.setUnderlineText(z);
    }
}
