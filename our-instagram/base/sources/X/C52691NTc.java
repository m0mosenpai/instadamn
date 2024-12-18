package X;

import android.content.Context;
import android.graphics.drawable.InsetDrawable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.NTc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52691NTc extends AbstractC55206OeJ {
    public int A00;
    public IKG A01;
    public C31349DqE A02;
    public C31349DqE A03;
    public C51874MwI A04;
    public Integer A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public Integer A09;
    public final View A0A;
    public final UserSession A0B;
    public final OI6 A0C;
    public final PCL A0D;
    public final C55177Odh A0E;
    public final ArrayList A0F;
    public final ArrayList A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52691NTc(View view, UserSession userSession, OI6 oi6, C55177Odh c55177Odh) {
        super(AbstractC25225BEi.A1D(C51874MwI.class));
        AbstractC37302Gc3.A1U(c55177Odh, oi6);
        this.A0A = view;
        this.A0B = userSession;
        this.A0E = c55177Odh;
        this.A0C = oi6;
        this.A0D = PCL.A00;
        this.A0J = C57543PgH.A01(this, 45);
        this.A0I = C57543PgH.A01(this, 44);
        this.A0H = C57543PgH.A01(this, 42);
        this.A07 = true;
        this.A0G = AbstractC166987dD.A1E();
        this.A0F = AbstractC166987dD.A1E();
    }

    public static final void A02(C146106i8 c146106i8, C52691NTc c52691NTc, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        A03(c146106i8, c52691NTc, interfaceC16820sZ, interfaceC16820sZ2, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0216, code lost:
    
        if (r3.length() == 0) goto L59;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0024. Please report as an issue. */
    @Override // X.AbstractC55206OeJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void A0I(X.InterfaceC57855PlL r15) {
        /*
            Method dump skipped, instructions count: 1134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52691NTc.A0I(X.PlL):void");
    }

    public static final void A01(InterfaceC58151PqG interfaceC58151PqG, IMN imn, C52691NTc c52691NTc, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, boolean z) {
        if (c52691NTc.A05 == null) {
            c52691NTc.A0F.add(new C45125Jxu(imn, interfaceC16820sZ, interfaceC16820sZ2, z));
            A04(c52691NTc);
        } else {
            if (c52691NTc.A08) {
                return;
            }
            imn.A03 = new P3C(interfaceC58151PqG, c52691NTc, interfaceC16820sZ, interfaceC16820sZ2);
            IKG A00 = imn.A00();
            ((C3O0) c52691NTc.A0J.getValue()).A07(A00);
            if (!z) {
                return;
            }
            c52691NTc.A01 = A00;
        }
    }

    public static final void A03(C146106i8 c146106i8, C52691NTc c52691NTc, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, boolean z, boolean z2) {
        C31349DqE c31349DqE;
        if (z2 && (c31349DqE = c52691NTc.A03) != null) {
            ((C3O0) c52691NTc.A0J.getValue()).A09(c31349DqE);
            c52691NTc.A03 = null;
        }
        if (c52691NTc.A05 == null) {
            c52691NTc.A0G.add(new C45125Jxu(c146106i8, interfaceC16820sZ, interfaceC16820sZ2, z));
            A04(c52691NTc);
            return;
        }
        c146106i8.A0A(new C42695Iuq(2, interfaceC16820sZ2, c52691NTc, interfaceC16820sZ));
        C31349DqE A00 = c146106i8.A00();
        ((C3O0) c52691NTc.A0J.getValue()).A0A(A00);
        if (z2) {
            c52691NTc.A03 = A00;
        } else {
            if (!z) {
                return;
            }
            c52691NTc.A02 = A00;
        }
    }

    public static final void A04(C52691NTc c52691NTc) {
        if (AbstractC25226BEj.A1b(c52691NTc.A0G) || AbstractC25226BEj.A1b(c52691NTc.A0F)) {
            c52691NTc.A0E.A06(PE6.A00, 1000L);
        }
    }

    public static final void A05(C52691NTc c52691NTc) {
        int i;
        Integer num = c52691NTc.A05;
        if (c52691NTc.A07 && !c52691NTc.A06 && num != null) {
            i = num.intValue();
        } else {
            i = c52691NTc.A00;
        }
        Integer num2 = c52691NTc.A09;
        if (num2 == null || i != num2.intValue()) {
            InterfaceC09390do interfaceC09390do = c52691NTc.A0I;
            View A0d = AbstractC166987dD.A0d(interfaceC09390do);
            if (num2 == null) {
                A0d.setTranslationY(-i);
            } else {
                MSX.A10(A0d);
                MSY.A0F(AbstractC166987dD.A0d(interfaceC09390do).animate().translationY(-i)).start();
            }
            c52691NTc.A09 = Integer.valueOf(i);
        }
    }

    private final InsetDrawable A00(int i) {
        Context A0C = AbstractC55206OeJ.A0C(this);
        return new InsetDrawable(A0C.getDrawable(i), A0C.getResources().getDimensionPixelOffset(R.dimen.abc_control_corner_material));
    }

    public static final void A06(C52691NTc c52691NTc, CharSequence charSequence, Integer num, String str, boolean z, boolean z2) {
        C146106i8 A0Y = AbstractC31174DnI.A0Y();
        A0Y.A0D = charSequence;
        A0Y.A0I = str;
        if (charSequence instanceof SpannableStringBuilder) {
            MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
            C14360o3.A07(linkMovementMethod);
            A0Y.A05 = linkMovementMethod;
        }
        if (num != null) {
            A0Y.A01 = num.intValue();
        }
        if (z) {
            A0Y.A06();
        }
        A03(A0Y, c52691NTc, C57449Pel.A00, C57450Pem.A00, true, z2);
    }

    private final void A07(Integer num, String str, String str2, String str3) {
        String A0p = AbstractC166997dE.A0p(AbstractC55206OeJ.A0C(this), 2131964388);
        C146106i8 A0Y = AbstractC31174DnI.A0Y();
        A0Y.A0D = str;
        A0Y.A0I = str2;
        A0Y.A0B(EnumC142006bJ.A03);
        A0Y.A09 = AbstractC25225BEi.A0t(str3);
        A0Y.A0G = A0p;
        A0Y.A0L = true;
        A0Y.A01 = 7000;
        A02(A0Y, this, new C57536PgA(32, num, this), new C57536PgA(31, num, this));
    }

    private final void A08(String str) {
        C146106i8 A0Y = AbstractC31174DnI.A0Y();
        A0Y.A0D = str;
        A0Y.A02();
        Context A0C = AbstractC55206OeJ.A0C(this);
        A0Y.A08(new InsetDrawable(A0C.getDrawable(R.drawable.instagram_bluetooth_pano_outline_24), A0C.getResources().getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material)), A0C.getColor(AbstractC53242c7.A0E(A0C)));
        A0Y.A06();
        A02(A0Y, this, C57449Pel.A00, C57450Pem.A00);
    }

    private final void A09(String str, String str2, int i) {
        C146106i8 A0Y = AbstractC31174DnI.A0Y();
        A0Y.A0D = str;
        A0Y.A02();
        A0Y.A08(A00(i), AbstractC31174DnI.A03(AbstractC55206OeJ.A0C(this)));
        if (str2 != null) {
            A0Y.A0I = str2;
        }
        A0Y.A06();
        A02(A0Y, this, C57449Pel.A00, C57450Pem.A00);
    }

    private final void A0A(String str, String str2, String str3) {
        C146106i8 A0Y = AbstractC31174DnI.A0Y();
        A0Y.A0D = str;
        if (str3 != null && str3.length() != 0) {
            A0Y.A09 = AbstractC25225BEi.A0t(str3);
            A0Y.A0B(EnumC142006bJ.A03);
        }
        if (str2 != null) {
            A0Y.A0I = str2;
        }
        A02(A0Y, this, C57449Pel.A00, C57450Pem.A00);
    }

    private final void A0B(String str, String str2, boolean z) {
        C146106i8 A0j = AbstractC25229BEm.A0j();
        A0j.A0H = str;
        A0j.A0D = str2;
        if (z) {
            A0j.A06();
        }
        A02(A0j, this, C57449Pel.A00, C57450Pem.A00);
    }
}
