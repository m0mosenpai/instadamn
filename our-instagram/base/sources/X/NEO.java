package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsFooterCell;
import java.util.BitSet;
import java.util.LinkedHashMap;

/* loaded from: classes9.dex */
public final class NEO extends AbstractC66412zI {
    public final AbstractC59962oe A00;
    public final UserSession A01;

    public NEO(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A00 = abstractC59962oe;
        this.A01 = userSession;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C51364MmP(this.A00, this.A01, new IgdsFooterCell(AbstractC166997dE.A0L(viewGroup), null));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x002e. Please report as an issue. */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        CharSequence A02;
        int i;
        String A0p;
        ClickableSpan c31754Dx7;
        CharSequence charSequence;
        SpannableStringBuilder spannableStringBuilder;
        Ov7 ov7 = (Ov7) interfaceC66482zP;
        C51364MmP c51364MmP = (C51364MmP) c3oo;
        AbstractC167007dF.A1K(ov7, c51364MmP);
        Integer num = ov7.A00;
        String str = ov7.A01;
        C14360o3.A0B(num, 0);
        IgdsFooterCell igdsFooterCell = c51364MmP.A03;
        Context context = c51364MmP.A00;
        igdsFooterCell.A00(AbstractC166997dE.A0p(context, C51364MmP.A00(num, str)));
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        C14360o3.A07(linkMovementMethod);
        igdsFooterCell.A02.setMovementMethod(linkMovementMethod);
        switch (num.intValue()) {
            case 1:
            case 2:
            case 3:
                AbstractC59962oe abstractC59962oe = c51364MmP.A01;
                A02 = AbstractC55199Oe9.A02(abstractC59962oe.requireActivity(), c51364MmP.A02, abstractC59962oe.getModuleName(), C51364MmP.A00(num, str));
                igdsFooterCell.A00(A02);
                return;
            case 4:
            case 6:
                AbstractC59962oe abstractC59962oe2 = c51364MmP.A01;
                FragmentActivity requireActivity = abstractC59962oe2.requireActivity();
                UserSession userSession = c51364MmP.A02;
                String moduleName = abstractC59962oe2.getModuleName();
                boolean equals = str.equals("story");
                C14360o3.A0B(moduleName, 3);
                A0p = AbstractC166997dE.A0p(requireActivity, 2131952911);
                int i2 = 2131952912;
                if (equals) {
                    i2 = 2131952913;
                }
                String A0b = AbstractC31177DnL.A0b(requireActivity, A0p, i2);
                C62862tP A01 = C62862tP.A01(null, requireActivity, AbstractC31171DnF.A0D(moduleName), userSession);
                LinkedHashMap A1I = AbstractC166987dD.A1I();
                if (new BitSet(0).nextClearBit(0) >= 0) {
                    c31754Dx7 = new C31754Dx7(requireActivity, new C35774FrC(AbstractC06930Yk.A0B(A1I), AbstractC06930Yk.A0E()), A01, userSession);
                    spannableStringBuilder = AbstractC25225BEi.A0H(A0b);
                    AnonymousClass773.A05(spannableStringBuilder, c31754Dx7, A0p);
                    charSequence = spannableStringBuilder;
                    A02 = charSequence;
                    igdsFooterCell.A00(A02);
                    return;
                }
                throw AbstractC166987dD.A14("Missing required params");
            case 5:
                i = 2131960920;
                charSequence = AbstractC166997dE.A0p(context, i);
                A02 = charSequence;
                igdsFooterCell.A00(A02);
                return;
            case 7:
                String A0p2 = AbstractC166997dE.A0p(context, 2131965064);
                AbstractC59962oe abstractC59962oe3 = c51364MmP.A01;
                FragmentActivity requireActivity2 = abstractC59962oe3.requireActivity();
                UserSession userSession2 = c51364MmP.A02;
                String A0f = AbstractC167007dF.A0f(context, A0p2, AbstractC53850Nre.A00(num));
                String moduleName2 = abstractC59962oe3.getModuleName();
                C14360o3.A0B(moduleName2, 6);
                A02 = MSY.A0B(new C31753Dx6(userSession2, requireActivity2, moduleName2, 0), A0f, A0p2);
                igdsFooterCell.A00(A02);
                return;
            case 8:
            default:
                return;
            case 9:
                charSequence = AbstractC35253Fgm.A00(c51364MmP.A01.requireActivity(), c51364MmP.A02);
                A02 = charSequence;
                igdsFooterCell.A00(A02);
                return;
            case 10:
                i = 2131969349;
                charSequence = AbstractC166997dE.A0p(context, i);
                A02 = charSequence;
                igdsFooterCell.A00(A02);
                return;
            case 11:
                A0p = AbstractC166997dE.A0p(context, 2131954194);
                SpannableStringBuilder A07 = AbstractC31178DnM.A07(context, A0p, 2131954216);
                c31754Dx7 = new C31745Dwy(context, 0);
                spannableStringBuilder = A07;
                AnonymousClass773.A05(spannableStringBuilder, c31754Dx7, A0p);
                charSequence = spannableStringBuilder;
                A02 = charSequence;
                igdsFooterCell.A00(A02);
                return;
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return Ov7.class;
    }
}
