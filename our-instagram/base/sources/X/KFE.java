package X;

import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.api.schemas.StickerTraySectionCTAType;
import com.instagram.arlink.ui.GridPatternView;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.nametag.NametagCardView;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class KFE extends AbstractC60592pi implements C3PE, C8NZ, InterfaceC50394MMw {
    public int A00;
    public int A01;
    public int A02;
    public EnumC46213Kcp A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final Activity A0A;
    public final View A0B;
    public final View A0C;
    public final View A0D;
    public final View A0E;
    public final View A0F;
    public final TextView A0G;
    public final KDZ A0H;
    public final C47955LGq A0I;
    public final ViewOnTouchListenerC48085LQk A0J;
    public final LO8 A0K;
    public final LGZ A0L;
    public final GridPatternView A0M;
    public final AbstractC59962oe A0N;
    public final UserSession A0O;
    public final KNI A0P;
    public final NametagCardView A0Q;
    public final ArgbEvaluator A0R;
    public final View A0S;
    public final ImageView A0T;
    public final ImageView A0U;
    public final TextView A0V;
    public final TextView A0W;
    public final AbstractC59962oe A0X;
    public final boolean A0Y;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x00b3, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r21, 36314837548927838L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public KFE(android.app.Activity r15, android.view.View r16, X.C47955LGq r17, X.L5R r18, X.LGZ r19, X.AbstractC59962oe r20, com.instagram.common.session.UserSession r21, X.C3I9 r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KFE.<init>(android.app.Activity, android.view.View, X.LGq, X.L5R, X.LGZ, X.2oe, com.instagram.common.session.UserSession, X.3I9, java.lang.String, java.lang.String):void");
    }

    @Override // X.InterfaceC150206pS
    public final boolean Cb5(boolean z) {
        return false;
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void Chi(Medium medium, long j, long j2, boolean z) {
    }

    @Override // X.InterfaceC186108Ne
    public final void Coa(View view, StickerTraySectionCTAType stickerTraySectionCTAType) {
    }

    @Override // X.InterfaceC186088Nc
    public final void Cu9(View view, C148286ly c148286ly, String str) {
    }

    @Override // X.InterfaceC186118Nf
    public final void Cuu(C214499en c214499en) {
    }

    @Override // X.InterfaceC186088Nc
    public final void CwB() {
    }

    @Override // X.InterfaceC186088Nc
    public final void CwD(C148286ly c148286ly, String str) {
    }

    @Override // X.InterfaceC150196pR
    public final void CxL(View view, InterfaceC148316m1 interfaceC148316m1) {
    }

    @Override // X.InterfaceC150196pR
    public final void CxM(Drawable drawable, View view, InterfaceC148316m1 interfaceC148316m1) {
        C148336m3 B1F;
        C14360o3.A0B(interfaceC148316m1, 0);
        if (interfaceC148316m1.CBc() == EnumC148326m2.A04 && (B1F = interfaceC148316m1.B1F()) != null) {
            String str = B1F.A02;
            this.A04 = str;
            this.A0M.setEmoji(str);
            this.A0J.A03(true);
            this.A0P.A05(B1F);
        }
    }

    @Override // X.C8NZ
    public final void CyY() {
    }

    @Override // X.C8NZ
    public final void Cya() {
    }

    @Override // X.C8NZ
    public final void Cyl(Drawable drawable, InterfaceC148316m1 interfaceC148316m1) {
    }

    @Override // X.C8NZ
    public final void Cym() {
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void D5Y() {
    }

    @Override // X.InterfaceC186128Ng
    public final void D7t(AlC alC) {
    }

    @Override // X.InterfaceC186128Ng
    public final void D87() {
    }

    @Override // X.InterfaceC186098Nd
    public final void D92() {
    }

    @Override // X.InterfaceC186098Nd
    public final void D93(Medium medium, Integer num) {
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void D94(Bitmap bitmap, String str) {
    }

    @Override // X.InterfaceC186068Na
    public final void D95() {
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void D97() {
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void D98(C9ZM c9zm) {
    }

    @Override // X.C7OC
    public final void DDL(Drawable drawable, View view, C148336m3 c148336m3) {
        C14360o3.A0B(c148336m3, 0);
        String str = c148336m3.A02;
        this.A04 = str;
        this.A0M.setEmoji(str);
        this.A0J.A03(true);
        this.A0P.A05(c148336m3);
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void DEz() {
    }

    @Override // X.C8NZ
    public final void DHT(C9QC c9qc, C148276lx c148276lx) {
    }

    @Override // X.InterfaceC186118Nf
    public final void DIl(User user, String str) {
    }

    @Override // X.InterfaceC186138Nh
    public final void DIz(Medium medium, boolean z) {
    }

    @Override // X.C3PE
    public final void DQY(View view) {
    }

    @Override // X.InterfaceC186098Nd
    public final void DSY(Medium medium) {
    }

    @Override // X.C8NZ
    public final void DSk(Drawable drawable, InterfaceC148316m1 interfaceC148316m1) {
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void DWm() {
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void DY4(Bitmap bitmap, String str) {
    }

    @Override // X.InterfaceC186148Ni
    public final void DZR(Medium medium) {
    }

    @Override // X.InterfaceC186078Nb
    public final void DoY(View view, C148276lx c148276lx) {
    }

    @Override // X.InterfaceC186078Nb
    public final void DoZ(Drawable drawable, C148276lx c148276lx, Long l) {
    }

    @Override // X.InterfaceC186078Nb
    public final void Doa(Drawable drawable, C148276lx c148276lx, Long l, boolean z) {
    }

    @Override // X.InterfaceC186158Nj
    public final void Doj() {
    }

    @Override // X.InterfaceC186108Ne
    public final void Don(StickerTraySectionCTAType stickerTraySectionCTAType) {
    }

    @Override // X.C3PE
    public final boolean DsE(View view) {
        SparseArray sparseArray;
        C14360o3.A0B(view, 0);
        if (view.getId() == R.id.background_mode_button) {
            int length = (this.A03.A01 + 1) % EnumC46213Kcp.values().length;
            if (this.A08) {
                sparseArray = EnumC46213Kcp.A03;
            } else {
                sparseArray = EnumC46213Kcp.A04;
            }
            if (length >= EnumC46213Kcp.A03.size()) {
                length = 0;
            }
            EnumC46213Kcp enumC46213Kcp = (EnumC46213Kcp) sparseArray.get(length);
            if (enumC46213Kcp == null) {
                enumC46213Kcp = EnumC46213Kcp.A07;
            }
            this.A03 = enumC46213Kcp;
            A05(this);
            A04(this);
        } else if (view.getId() == this.A0W.getId()) {
            if (this.A03 == EnumC46213Kcp.A0A) {
                this.A0K.A04(this.A02, true, true);
                this.A07 = true;
                return true;
            }
        } else {
            if (view.getId() != this.A0G.getId()) {
                return false;
            }
            if (this.A0I.A03()) {
                C46047Ka0 c46047Ka0 = new C46047Ka0();
                c46047Ka0.A00 = this;
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putBoolean("ARG_IS_BACKGROUND_IMAGE_BLURRED", this.A06);
                c46047Ka0.setArguments(A0b);
                C189448aO A0y = AbstractC25225BEi.A0y(this.A0O);
                A0y.A0k = true;
                A0y.A1O = true;
                A0y.A00().A02(this.A0A, c46047Ka0);
                return true;
            }
            A08(this, false);
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC186168Nk
    public final void Dwv(UpcomingEvent upcomingEvent) {
    }

    private final void A00() {
        if (this.A0Y && !this.A09) {
            boolean z = false;
            C08730cb c08730cb = C17060sy.A01;
            UserSession userSession = this.A0O;
            InterfaceC223316m BW9 = AbstractC31171DnF.A0T(userSession, c08730cb).BW9();
            if (BW9 == null) {
                L9E l9e = new L9E(new C223216l(null, null, null, null, null, null, null, null, null, null));
                l9e.A04 = Integer.valueOf(this.A03.A01);
                BW9 = l9e.A01();
                z = true;
            }
            Integer BUH = BW9.BUH();
            int i = this.A03.A01;
            if (BUH == null || BUH.intValue() != i) {
                L9E AKY = BW9.AKY();
                AKY.A04 = Integer.valueOf(this.A03.A01);
                BW9 = AKY.A00();
                z = true;
            }
            Integer BAD = BW9.BAD();
            int i2 = this.A00;
            if (BAD == null || BAD.intValue() != i2) {
                L9E AKY2 = BW9.AKY();
                AKY2.A03 = Integer.valueOf(this.A00);
                BW9 = AKY2.A00();
                z = true;
            }
            if (!C14360o3.A0K(this.A04, BW9.getEmoji())) {
                L9E AKY3 = BW9.AKY();
                AKY3.A06 = this.A04;
                BW9 = AKY3.A00();
                z = true;
            }
            Integer B1G = BW9.B1G();
            int i3 = this.A01;
            if (B1G == null || B1G.intValue() != i3) {
                L9E AKY4 = BW9.AKY();
                AKY4.A02 = Integer.valueOf(this.A01);
                BW9 = AKY4.A00();
                z = true;
            }
            Integer Bt1 = BW9.Bt1();
            int i4 = this.A02;
            if (Bt1 == null || Bt1.intValue() != i4) {
                L9E AKY5 = BW9.AKY();
                AKY5.A05 = Integer.valueOf(this.A02);
                BW9 = AKY5.A00();
                z = true;
            }
            if (this.A05) {
                L9E AKY6 = BW9.AKY();
                AKY6.A05 = Integer.valueOf(this.A02);
                BW9 = AKY6.A00();
            } else if (!z) {
                return;
            }
            if (this.A03 == EnumC46213Kcp.A0A && !this.A0L.A02() && !this.A07) {
                this.A03 = EnumC46213Kcp.A08;
                L9E AKY7 = BW9.AKY();
                AKY7.A04 = Integer.valueOf(this.A03.A01);
                BW9 = AKY7.A00();
            }
            AbstractC31171DnF.A0T(userSession, c08730cb).EZY(BW9);
            int i5 = this.A03.A01;
            int i6 = this.A00;
            String str = this.A04;
            if (str == null) {
                str = "";
            }
            int i7 = this.A01;
            int i8 = this.A02;
            C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
            A0M.A0B("users/nametag_config/");
            A0M.A9s(DatePickerDialogModule.ARG_MODE, String.valueOf(i5));
            A0M.A9s("gradient", String.valueOf(i6));
            A0M.A9s("emoji", str);
            A0M.A9s("emoji_color", String.valueOf(i7));
            A0M.A9s("selfie_sticker", String.valueOf(i8));
            A0M.A0S(C38862H9k.class, C41285IPa.class);
            A0M.A0R = true;
            C1ON A0N = A0M.A0N();
            A0N.A00 = new C67855Uza(userSession, 0);
            C1GJ.A03(A0N);
        }
    }

    public static final void A01(InterfaceC223316m interfaceC223316m, KFE kfe) {
        SparseArray sparseArray;
        boolean A1b;
        EnumC46213Kcp enumC46213Kcp = EnumC46213Kcp.A07;
        kfe.A03 = enumC46213Kcp;
        if (kfe.A0Y && interfaceC223316m != null) {
            int A0K = AbstractC167017dG.A0K(interfaceC223316m.BUH());
            if (kfe.A08) {
                sparseArray = EnumC46213Kcp.A03;
            } else {
                sparseArray = EnumC46213Kcp.A04;
            }
            if (A0K >= EnumC46213Kcp.A03.size()) {
                A0K = 0;
            }
            EnumC46213Kcp enumC46213Kcp2 = (EnumC46213Kcp) sparseArray.get(A0K);
            if (enumC46213Kcp2 == null) {
                enumC46213Kcp2 = enumC46213Kcp;
            }
            kfe.A03 = enumC46213Kcp2;
            kfe.A00 = AbstractC167017dG.A0K(interfaceC223316m.BAD());
            kfe.A04 = interfaceC223316m.getEmoji();
            kfe.A01 = AbstractC167017dG.A0K(interfaceC223316m.B1G());
            kfe.A02 = AbstractC167017dG.A0K(interfaceC223316m.Bt1());
            Boolean CQS = interfaceC223316m.CQS();
            if (CQS != null) {
                A1b = CQS.booleanValue();
            } else {
                C23031Ai A00 = AbstractC23021Ah.A00(kfe.A0O);
                A1b = AbstractC167017dG.A1b(A00, A00.A1y, C23031Ai.A8c, 99);
            }
            kfe.A06 = A1b;
        }
        if (kfe.A00 >= 5) {
            kfe.A00 = 0;
        }
        String str = kfe.A04;
        if (str == null || str.length() == 0 || !C168157fA.A03(str)) {
            kfe.A04 = C148336m3.A04.A07(kfe.A0O)[0].A02;
        }
        if (kfe.A01 == 0) {
            kfe.A01 = -16777216;
        }
        EnumC46213Kcp enumC46213Kcp3 = kfe.A03;
        EnumC46213Kcp enumC46213Kcp4 = EnumC46213Kcp.A0A;
        if (enumC46213Kcp3 == enumC46213Kcp4 && !kfe.A0L.A02()) {
            kfe.A03 = EnumC46213Kcp.A08;
        }
        if (kfe.A02 >= EnumC46219Kcv.values().length) {
            kfe.A02 = 0;
        }
        LGZ lgz = kfe.A0L;
        if (lgz.A00 != null) {
            if (kfe.A0N.isResumed() && kfe.A03 == enumC46213Kcp4) {
                A03(kfe);
            }
        } else {
            lgz.A02.schedule(new KK4(1, lgz, kfe, interfaceC223316m));
        }
        EnumC46213Kcp enumC46213Kcp5 = kfe.A03;
        EnumC46213Kcp enumC46213Kcp6 = EnumC46213Kcp.A09;
        if (enumC46213Kcp5 == enumC46213Kcp6 && !kfe.A0I.A03()) {
            kfe.A03 = EnumC46213Kcp.A08;
        }
        C47955LGq c47955LGq = kfe.A0I;
        if (c47955LGq.A00 != null) {
            c47955LGq.A02(kfe);
            if (kfe.A0N.isResumed() && kfe.A03 == enumC46213Kcp6) {
                A07(kfe);
                return;
            }
            return;
        }
        c47955LGq.A04.schedule(new KK4(0, interfaceC223316m, c47955LGq, kfe));
    }

    public static void A02(KFE kfe) {
        kfe.A0G.setVisibility(8);
        kfe.A0B.setVisibility(8);
        kfe.A0D.setVisibility(8);
        kfe.A0C.setVisibility(8);
    }

    public static final void A03(KFE kfe) {
        EnumC46219Kcv enumC46219Kcv = (EnumC46219Kcv) EnumC46219Kcv.A04.get(kfe.A02);
        if (enumC46219Kcv == null) {
            enumC46219Kcv = EnumC46219Kcv.A0A;
        }
        LGZ lgz = kfe.A0L;
        boolean A1W = AbstractC167007dF.A1W(lgz.A00);
        GridPatternView gridPatternView = kfe.A0M;
        if (A1W) {
            gridPatternView.setSelfieWithSticker(lgz.A01(enumC46219Kcv));
        } else {
            gridPatternView.setSticker(enumC46219Kcv.A02);
        }
        gridPatternView.setVisibility(0);
    }

    public static final void A04(KFE kfe) {
        int i;
        int i2;
        int ordinal = kfe.A03.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        kfe.A0E.setVisibility(8);
                        kfe.A0M.setVisibility(8);
                        kfe.A0B.setVisibility(0);
                        kfe.A0G.setVisibility(0);
                        C47955LGq c47955LGq = kfe.A0I;
                        if (c47955LGq.A03()) {
                            kfe.A0D.setVisibility(0);
                            kfe.A0C.setVisibility(0);
                            Integer num = c47955LGq.A02;
                            if (num != null) {
                                i2 = num.intValue();
                            } else {
                                i2 = -16777216;
                            }
                            kfe.A0Q.setTintColor(i2);
                        } else {
                            kfe.A0Q.setTintColor(-16777216);
                        }
                        kfe.A0K.A05(false);
                        kfe.A07 = false;
                        A07(kfe);
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    kfe.A0E.setVisibility(8);
                    GridPatternView gridPatternView = kfe.A0M;
                    gridPatternView.setVisibility(0);
                    A02(kfe);
                    EnumC46219Kcv enumC46219Kcv = (EnumC46219Kcv) EnumC46219Kcv.A04.get(kfe.A02);
                    if (enumC46219Kcv == null) {
                        enumC46219Kcv = EnumC46219Kcv.A0A;
                    }
                    LGZ lgz = kfe.A0L;
                    if (lgz.A00 != null) {
                        gridPatternView.setSelfieWithSticker(lgz.A01(enumC46219Kcv));
                    } else if (!lgz.A02()) {
                        kfe.A0K.A04(kfe.A02, false, false);
                        kfe.A07 = true;
                        gridPatternView.setSticker(enumC46219Kcv.A02);
                    }
                    kfe.A0Q.setTintColor(-16777216);
                }
            } else {
                kfe.A0E.setVisibility(8);
                GridPatternView gridPatternView2 = kfe.A0M;
                gridPatternView2.setVisibility(0);
                A02(kfe);
                gridPatternView2.setEmoji(kfe.A04);
                Integer num2 = gridPatternView2.A03;
                NametagCardView nametagCardView = kfe.A0Q;
                if (num2 != null) {
                    i = num2.intValue();
                } else {
                    i = kfe.A01;
                }
                nametagCardView.setTintColor(i);
            }
        } else {
            kfe.A0E.setVisibility(0);
            kfe.A0M.setVisibility(8);
            A02(kfe);
            kfe.A0K.A05(false);
            kfe.A07 = false;
            A06(kfe);
        }
        kfe.A0J.A03(true);
    }

    public static final void A05(KFE kfe) {
        Context context = kfe.A0F.getContext();
        boolean z = kfe.A03.A02;
        int i = R.color.grey_9;
        if (z) {
            i = R.color.design_dark_default_color_on_background;
        }
        int color = context.getColor(i);
        ColorFilter A00 = C3DY.A00(color);
        ImageView imageView = kfe.A0T;
        imageView.setColorFilter(A00);
        ImageView imageView2 = kfe.A0U;
        imageView2.setColorFilter(A00);
        TextView textView = kfe.A0V;
        boolean z2 = kfe.A03.A02;
        int i2 = R.drawable.mode_button_background_dark;
        if (z2) {
            i2 = R.drawable.mode_button_background_light;
        }
        textView.setBackgroundResource(i2);
        textView.setText(kfe.A03.A00);
        int i3 = 0;
        AbstractC37302Gc3.A0o(context, kfe.A0S, AbstractC166997dE.A0p(context, kfe.A03.A00), 2131953592);
        textView.setTextColor(color);
        if (!kfe.A03.A02) {
            textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        } else {
            textView.setShadowLayer(8.0f, 0.0f, 0.0f, context.getColor(R.color.black_20_transparent));
        }
        imageView2.setVisibility(AbstractC167007dF.A05(kfe.A0Y ? 1 : 0));
        TextView textView2 = kfe.A0W;
        textView2.setTextColor(color);
        AbstractC167027dH.A0d(A00, textView2.getCompoundDrawables()[0]);
        int i4 = 8;
        if (kfe.A03 == EnumC46213Kcp.A0A) {
            i4 = 0;
        }
        textView2.setVisibility(i4);
        EnumC46213Kcp enumC46213Kcp = kfe.A03;
        EnumC46213Kcp enumC46213Kcp2 = EnumC46213Kcp.A09;
        if (enumC46213Kcp == enumC46213Kcp2) {
            boolean A03 = kfe.A0I.A03();
            TextView textView3 = kfe.A0G;
            if (A03) {
                textView3.setText(2131953595);
                int A032 = AbstractC166997dE.A03(context);
                ColorFilter A002 = C3DY.A00(A032);
                imageView.setColorFilter(A002);
                imageView2.setColorFilter(A002);
                AbstractC167027dH.A0d(A002, textView3.getCompoundDrawables()[0]);
                textView.setBackgroundResource(R.drawable.mode_button_background_light);
                textView.setTextColor(A032);
                textView3.setTextColor(A032);
            } else {
                textView3.setText(2131953593);
            }
        }
        TextView textView4 = kfe.A0G;
        if (kfe.A03 != enumC46213Kcp2) {
            i3 = 8;
        }
        textView4.setVisibility(i3);
    }

    public static final void A06(KFE kfe) {
        int[] iArr = NametagCardView.A0F[kfe.A00];
        C14360o3.A04(iArr);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, iArr);
        gradientDrawable.setDither(true);
        View view = kfe.A0E;
        RectF rectF = AbstractC13880nE.A01;
        C14360o3.A0B(view, 0);
        view.setBackground(gradientDrawable);
        kfe.A0Q.setGradientTintColors(kfe.A00);
    }

    public static final void A07(KFE kfe) {
        Drawable colorDrawable;
        C47955LGq c47955LGq = kfe.A0I;
        Bitmap bitmap = c47955LGq.A00;
        boolean A1W = AbstractC167007dF.A1W(bitmap);
        View view = kfe.A0F;
        if (A1W) {
            Resources resources = view.getResources();
            if (kfe.A06) {
                bitmap = c47955LGq.A01;
            }
            colorDrawable = new BitmapDrawable(resources, bitmap);
        } else {
            colorDrawable = new ColorDrawable(AbstractC167007dF.A09(view.getContext(), R.attr.igds_color_secondary_background));
        }
        View view2 = kfe.A0B;
        RectF rectF = AbstractC13880nE.A01;
        C14360o3.A0B(view2, 0);
        view2.setBackground(colorDrawable);
        view2.refreshDrawableState();
    }

    public static final void A08(KFE kfe, boolean z) {
        C189448aO A0y = AbstractC25225BEi.A0y(kfe.A0O);
        AbstractC25225BEi.A1Q(A0y, true);
        A0y.A0k = true;
        A0y.A1O = true;
        A0y.A03 = 0.9f;
        C189478aR A00 = A0y.A00();
        C3DO c3do = C3DN.A00;
        Activity activity = kfe.A0A;
        C3DN A002 = c3do.A00(activity);
        if (A002 != null) {
            if (z) {
                ((C3DP) A002).A0H = new C56770PHn(1, kfe, A00);
                A002.A0B();
            } else {
                A00.A02(activity, kfe.A0H);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(float r7) {
        /*
            r6 = this;
            X.Kcp r1 = r6.A03
            X.Kcp r0 = X.EnumC46213Kcp.A07
            r2 = 0
            r5 = 0
            if (r1 != r0) goto Lb6
            android.view.View r1 = r6.A0E
        La:
            r1.setAlpha(r7)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            int r0 = X.JQ0.A02(r0)
            r1.setVisibility(r0)
        L16:
            android.animation.ArgbEvaluator r4 = r6.A0R
            r0 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.Kcp r1 = r6.A03
            boolean r1 = r1.A02
            if (r1 != 0) goto L30
            android.view.View r0 = r6.A0F
            android.content.Context r1 = r0.getContext()
            r0 = 2131100284(0x7f06027c, float:1.7812945E38)
            int r0 = r1.getColor(r0)
        L30:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r4.evaluate(r7, r3, r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            int r0 = X.AbstractC25230BEn.A0D(r1, r0)
            android.graphics.ColorFilter r1 = X.C3DY.A00(r0)
            android.widget.ImageView r0 = r6.A0T
            r0.setColorFilter(r1)
            android.view.View r1 = r6.A0S
            r1.setAlpha(r7)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            int r0 = X.JQ0.A02(r0)
            r1.setVisibility(r0)
            android.widget.ImageView r1 = r6.A0U
            r1.setAlpha(r7)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            int r0 = X.JQ0.A02(r0)
            r1.setVisibility(r0)
            X.Kcp r1 = r6.A03
            X.Kcp r0 = X.EnumC46213Kcp.A0A
            if (r1 != r0) goto L77
            android.widget.TextView r1 = r6.A0W
            r1.setAlpha(r7)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            int r0 = X.JQ0.A02(r0)
            r1.setVisibility(r0)
        L77:
            X.Kcp r1 = r6.A03
            X.Kcp r0 = X.EnumC46213Kcp.A09
            if (r1 != r0) goto Lb5
            android.widget.TextView r1 = r6.A0G
            r1.setAlpha(r7)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            int r0 = X.JQ0.A02(r0)
            r1.setVisibility(r0)
            android.view.View r1 = r6.A0B
            r1.setAlpha(r7)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            int r0 = X.JQ0.A02(r0)
            r1.setVisibility(r0)
            android.view.View r1 = r6.A0C
            r1.setAlpha(r7)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            int r0 = X.JQ0.A02(r0)
            r1.setVisibility(r0)
            android.view.View r1 = r6.A0D
            r1.setAlpha(r7)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 > 0) goto Lb2
            r2 = 8
        Lb2:
            r1.setVisibility(r2)
        Lb5:
            return
        Lb6:
            X.Kcp r0 = X.EnumC46213Kcp.A0A
            if (r1 == r0) goto Lbe
            X.Kcp r0 = X.EnumC46213Kcp.A08
            if (r1 != r0) goto L16
        Lbe:
            com.instagram.arlink.ui.GridPatternView r1 = r6.A0M
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KFE.A09(float):void");
    }

    @Override // X.InterfaceC150206pS
    public final long Ayc() {
        return 0L;
    }

    @Override // X.InterfaceC150206pS
    public final AbstractC59962oe Baj() {
        return this.A0X;
    }

    @Override // X.C8NZ
    public final /* synthetic */ boolean Bvk() {
        return false;
    }

    @Override // X.InterfaceC150206pS
    public final boolean CXU() {
        return false;
    }

    @Override // X.InterfaceC150206pS
    public final boolean CYO() {
        return false;
    }

    @Override // X.InterfaceC150206pS
    public final boolean CZ3() {
        return false;
    }

    @Override // X.InterfaceC150206pS
    public final boolean CdE() {
        return false;
    }

    @Override // X.InterfaceC186078Nb
    public final boolean Cdj() {
        return false;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        LO8 lo8 = this.A0K;
        ViewGroup viewGroup = lo8.A03;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            InterfaceC174767qC interfaceC174767qC = lo8.A0H;
            if (interfaceC174767qC.CWZ()) {
                interfaceC174767qC.Eod(null);
                lo8.A01.setSurfaceTextureListener(null);
            }
        }
        A00();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        LO8 lo8 = this.A0K;
        ViewGroup viewGroup = lo8.A03;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            LO8.A02(lo8);
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        A00();
        ViewOnTouchListenerC48085LQk viewOnTouchListenerC48085LQk = this.A0J;
        if (viewOnTouchListenerC48085LQk.A07 != null) {
            viewOnTouchListenerC48085LQk.A02.setBackground(null);
            viewOnTouchListenerC48085LQk.A07.A06();
            viewOnTouchListenerC48085LQk.A07 = null;
        }
        C44063Jdo c44063Jdo = viewOnTouchListenerC48085LQk.A0A;
        if (c44063Jdo != null) {
            Iterator it = c44063Jdo.A07.iterator();
            while (it.hasNext()) {
                c44063Jdo.A02((L10) it.next(), false);
            }
        }
        LO8 lo8 = this.A0K;
        lo8.A05(false);
        if (lo8.A06 != null) {
            lo8.A05.setBackground(null);
            lo8.A06.A06();
            lo8.A06 = null;
        }
    }
}
