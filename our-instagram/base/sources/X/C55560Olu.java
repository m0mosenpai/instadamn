package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;
import java.util.HashMap;

/* renamed from: X.Olu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55560Olu implements InterfaceC58362lv {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C55560Olu(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.View, java.lang.Object, X.Mcq, android.view.ViewGroup] */
    @Override // X.InterfaceC58362lv
    public final void onChanged(Object obj) {
        C3DN A01;
        ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0;
        int i;
        switch (this.A00) {
            case 0:
                C54872OOh.A00((C44135Jf0) obj, (C54725OFc) this.A02);
                return;
            case 1:
                C51621MrE c51621MrE = (C51621MrE) obj;
                C14360o3.A0B(c51621MrE, 0);
                if (!c51621MrE.A05) {
                    OL1 ol1 = ((C52174N7f) this.A02).A06;
                    if (ol1 == null) {
                        AbstractC31171DnF.A0t();
                        throw C00O.createAndThrow();
                    }
                    C65960TxC c65960TxC = (C65960TxC) ol1.A02.getValue();
                    if (c51621MrE.A04) {
                        i = c51621MrE.A01;
                    } else {
                        i = c65960TxC.A02;
                    }
                    c65960TxC.A00 = i;
                    c65960TxC.A03.DjE(c51621MrE);
                    return;
                }
                ((C2GT) this.A01).A05((Fragment) this.A02);
                return;
            case 2:
                C51607Mqz c51607Mqz = (C51607Mqz) obj;
                if (!c51607Mqz.A02 && AbstractC25226BEj.A1b(c51607Mqz.A01)) {
                    N7O n7o = (N7O) this.A02;
                    if (!n7o.A0C) {
                        Integer num = n7o.A05;
                        if (num != null) {
                            int intValue = num.intValue();
                            View view = (View) this.A01;
                            C64P c64p = (C64P) view.findViewById(R.id.supporter_list_action_button);
                            c64p.setVisibility(0);
                            c64p.setPrimaryAction(n7o.getString(2131953635), new ViewOnClickListenerC55458OkC(n7o, intValue, 11));
                            if (AbstractC167007dF.A1Z(n7o.A0E)) {
                                if (n7o.A04 != EnumC53158NfD.A03) {
                                    return;
                                }
                            } else if (!n7o.A0B) {
                                return;
                            }
                            Context context = view.getContext();
                            if (context != null && (A01 = C3DN.A00.A01(context)) != null && (viewOnTouchListenerC65896Tw0 = ((C3DP) A01).A0D) != null) {
                                viewOnTouchListenerC65896Tw0.A0I(true);
                                return;
                            }
                            return;
                        }
                        throw AbstractC166987dD.A14("Missing supporters count for thank you story sticker");
                    }
                    return;
                }
                return;
            default:
                C51646Mrd c51646Mrd = (C51646Mrd) obj;
                C52121N4u c52121N4u = (C52121N4u) this.A02;
                View view2 = (View) this.A01;
                InterfaceC09390do interfaceC09390do = c52121N4u.A02;
                C51646Mrd c51646Mrd2 = (C51646Mrd) ((C54751OHg) interfaceC09390do.getValue()).A00.A02();
                if (c51646Mrd2 != null) {
                    ((ViewGroup) view2.findViewById(R.id.payment_container)).removeAllViews();
                    int i2 = 0;
                    for (Object obj2 : c51646Mrd2.A0C) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            AbstractC16960so.A1U();
                            throw C00O.createAndThrow();
                        }
                        C109724wz c109724wz = (C109724wz) obj2;
                        Context context2 = c52121N4u.getContext();
                        if (context2 != null) {
                            ?? constraintLayout = new ConstraintLayout(context2);
                            View inflate = View.inflate(context2, R.layout.iglive_user_pay_viewer_payment_row, constraintLayout);
                            constraintLayout.A01 = AbstractC31171DnF.A08(inflate, R.id.icon);
                            constraintLayout.A02 = (IgdsButton) inflate.findViewById(R.id.button);
                            constraintLayout.A00 = inflate.findViewById(R.id.divider);
                            HashMap hashMap = c51646Mrd2.A0B;
                            String str = c109724wz.A02;
                            String str2 = (String) hashMap.get(str);
                            if (str2 != null) {
                                String str3 = (String) c51646Mrd2.A0A.get(str);
                                Integer A00 = AbstractC54905OQc.A00(c109724wz.A01, false);
                                if (A00 != null) {
                                    constraintLayout.A01.setImageResource(A00.intValue());
                                }
                                constraintLayout.A01.setContentDescription(AnonymousClass001.A0T(str2, c52121N4u.getString(2131965578), ' '));
                                if (str3 != null) {
                                    constraintLayout.A01.setContentDescription(AnonymousClass001.A0T(C52121N4u.A00(str2, str3), c52121N4u.getString(2131965578), ' '));
                                }
                                String valueOf = String.valueOf(c109724wz.A00);
                                String str4 = c51646Mrd2.A05;
                                constraintLayout.A02.setText(str2);
                                if (str3 != null) {
                                    constraintLayout.A02.setContentDescription(C52121N4u.A00(str2, str3));
                                }
                                C0fQ.A00(new ViewOnClickListenerC55426Ojb(c109724wz, c52121N4u, constraintLayout, str2, valueOf, str4, 0), constraintLayout.A02);
                            }
                            View view3 = constraintLayout.A00;
                            int i4 = 0;
                            if (i2 == AbstractC25226BEj.A05(c51646Mrd2.A0C)) {
                                i4 = 8;
                            }
                            view3.setVisibility(i4);
                            ((ViewGroup) view2.findViewById(R.id.payment_container)).addView(constraintLayout);
                        }
                        i2 = i3;
                    }
                }
                boolean z = c51646Mrd.A0D;
                int i5 = 0;
                int i6 = 8;
                if (z) {
                    i6 = 0;
                    i5 = 8;
                }
                AbstractC43592JPx.A1I(view2, R.id.loading_indicator, i6);
                AbstractC43592JPx.A1I(view2, R.id.description, i5);
                AbstractC43592JPx.A1I(view2, R.id.payment_container, i5);
                AbstractC43592JPx.A1I(view2, R.id.helper_text, i5);
                C51646Mrd c51646Mrd3 = (C51646Mrd) ((C54751OHg) interfaceC09390do.getValue()).A00.A02();
                if (c51646Mrd3 != null) {
                    IgImageView A0a = AbstractC31172DnG.A0a(view2, R.id.profile_picture);
                    A0a.setVisibility(0);
                    ImageUrl imageUrl = c51646Mrd3.A00;
                    if (imageUrl != null) {
                        A0a.setUrl(imageUrl, c52121N4u);
                    }
                    AbstractC166987dD.A0e(view2, R.id.title).setText(c51646Mrd3.A09);
                    TextView A0e = AbstractC166987dD.A0e(view2, R.id.description);
                    SpannableStringBuilder A0H = AbstractC25225BEi.A0H(c51646Mrd3.A02);
                    AbstractC31174DnI.A1B(A0H, c51646Mrd3.A01);
                    AbstractC31177DnL.A0z(A0e, A0e.getContext());
                    A0e.setText(A0H);
                    FragmentActivity activity = c52121N4u.getActivity();
                    if (activity != null) {
                        UserSession A0r = AbstractC166987dD.A0r(c52121N4u.A03);
                        TextView textView = (TextView) AbstractC166987dD.A0c(view2, R.id.helper_text);
                        String str5 = c51646Mrd3.A06;
                        String str6 = c51646Mrd3.A07;
                        C2Fb c2Fb = C2Fb.A2M;
                        String str7 = c51646Mrd3.A08;
                        AbstractC167027dH.A0a(1, A0r, textView, str5, str6);
                        C14360o3.A0B(str7, 6);
                        AnonymousClass773.A07(new C52788NXx(activity, A0r, c2Fb, str6, AbstractC31174DnI.A02(activity)), textView, str7, str5);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
