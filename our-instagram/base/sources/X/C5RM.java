package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.io.IOException;

/* renamed from: X.5RM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5RM extends C5RN implements C5RO, C5RP, C5RQ, C5RS, C5RT {
    public static final int A0D = C1H4.A01(127.5f);
    public int A00;
    public int A01;
    public C9C2 A02;
    public Integer A03;
    public String A04;
    public int A05;
    public int A06;
    public Boolean A07;
    public boolean A08;
    public boolean A09;
    public final Drawable A0A;
    public final String A0B;
    public final Context A0C;

    @Override // X.C5RP
    public final void A9I(InterfaceC25177BCa interfaceC25177BCa) {
        C14360o3.A0B(interfaceC25177BCa, 0);
        Object obj = this.A0A;
        if (obj instanceof C5RP) {
            ((C5RP) obj).A9I(interfaceC25177BCa);
        }
    }

    @Override // X.C5RP
    public final void EFh(InterfaceC25177BCa interfaceC25177BCa) {
        C14360o3.A0B(interfaceC25177BCa, 0);
        Object obj = this.A0A;
        if (obj instanceof C5RP) {
            ((C5RP) obj).EFh(interfaceC25177BCa);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        C14360o3.A0B(canvas, 0);
        boolean A09 = A09();
        Boolean bool = this.A07;
        if (bool == null || !C14360o3.A0K(Boolean.valueOf(A09), bool)) {
            Drawable drawable = this.A0A;
            if (A09) {
                i = 255;
            } else {
                i = A0D;
            }
            drawable.setAlpha(i);
        }
        this.A07 = Boolean.valueOf(A09);
        if (A09 || this.A09) {
            this.A0A.draw(canvas);
        }
    }

    @Override // X.C5RQ
    public final int getDurationInMs() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        this.A0A.setBounds(rect);
    }

    public final Drawable A08() {
        Drawable drawable = this.A0A;
        if (drawable instanceof C194808jg) {
            Drawable A04 = ((C194808jg) drawable).A04();
            C14360o3.A07(A04);
            return A04;
        }
        return drawable;
    }

    public final boolean A09() {
        int max = Math.max(this.A05 + this.A06, 0);
        if (!this.A0A.isVisible()) {
            return false;
        }
        if (this.A03 != C05F.A00) {
            int i = this.A01;
            if (max > this.A00 || i > max) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C5RP
    public final void AHq() {
        Object obj = this.A0A;
        if (obj instanceof C5RP) {
            ((C5RP) obj).AHq();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C5RS
    public final void AQg(Canvas canvas) {
        Drawable drawable = this.A0A;
        if (drawable instanceof C5RS) {
            ((C5RS) drawable).AQg(canvas);
        } else {
            drawable.draw(canvas);
        }
    }

    @Override // X.C5RO
    public final Drawable Afg() {
        return this.A0A;
    }

    @Override // X.C5RO
    public final int B25() {
        return this.A00;
    }

    @Override // X.C5RO
    public final int Bzk() {
        return this.A01;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Drawable drawable = this.A0A;
        if (drawable.getAlpha() != 255) {
            drawable.setAlpha(255);
        }
        C5NL A00 = A07.A00(drawable);
        if (A00 != null) {
            String str8 = this.A0B;
            int i = this.A01;
            int i2 = this.A00;
            C9C2 c9c2 = this.A02;
            VoiceOption voiceOption = (VoiceOption) c9c2.A01;
            if (voiceOption != null) {
                str5 = voiceOption.A02;
            } else {
                str5 = null;
            }
            if (voiceOption != null) {
                str6 = voiceOption.A00;
            } else {
                str6 = null;
            }
            if (voiceOption != null) {
                str7 = voiceOption.A01;
            } else {
                str7 = null;
            }
            return new C5QI(A00, str8, str5, str6, str7, c9c2.A02, i, i2);
        }
        try {
            String str9 = this.A0B;
            int i3 = this.A01;
            int i4 = this.A00;
            C9C2 c9c22 = this.A02;
            VoiceOption voiceOption2 = (VoiceOption) c9c22.A01;
            if (voiceOption2 != null) {
                str = voiceOption2.A02;
            } else {
                str = null;
            }
            if (voiceOption2 != null) {
                str2 = voiceOption2.A00;
            } else {
                str2 = null;
            }
            if (voiceOption2 == null) {
                str3 = null;
            } else {
                str3 = voiceOption2.A01;
            }
            String str10 = c9c22.A02;
            if (drawable.getBounds().width() > 0 && drawable.getBounds().height() > 0) {
                str4 = AbstractC917048o.A03(drawable);
            } else {
                str4 = "";
            }
            return new C5QI(new Wm3(new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()), "bitmap_sticker_id", str4), str9, str, str2, str3, str10, i3, i4);
        } catch (IOException unused) {
            throw new IllegalStateException("Could not create TimedStickerClientModel");
        }
    }

    @Override // X.C5RO
    public final C9C2 CBG() {
        return this.A02;
    }

    @Override // X.C5RQ
    public final void EUp(int i, int i2) {
        boolean z;
        C74P c74p;
        C194808jg c194808jg;
        C89F c89f;
        this.A05 = i;
        Object obj = this.A0A;
        if (obj instanceof C5RQ) {
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.reels.interactive.model.AnimatedSticker");
            ((C5RQ) obj).EUp(this.A05, this.A00 - this.A01);
        }
        if (this.A08 && (A09() || this.A09)) {
            z = true;
        } else {
            z = false;
        }
        if (obj instanceof C210399Se) {
            C210399Se c210399Se = (C210399Se) obj;
            if (c210399Se.A0C == EnumC222999se.A06 && (c89f = c210399Se.A05) != null) {
                RoundedCornerFrameLayout roundedCornerFrameLayout = c89f.A0U;
                int i3 = 0;
                if (roundedCornerFrameLayout.getVisibility() == 0) {
                    if (!z) {
                        c89f.A0P.A04("sticker is not visible");
                        i3 = 4;
                    }
                    roundedCornerFrameLayout.setVisibility(i3);
                } else {
                    if (z) {
                        C89K c89k = c89f.A0P;
                        int i4 = i - c89f.A07;
                        if (i4 < 0) {
                            i4 = 0;
                        }
                        c89k.A02(i4);
                        c89k.A05("sticker turns visible");
                        roundedCornerFrameLayout.setVisibility(i3);
                    }
                    i3 = 4;
                    roundedCornerFrameLayout.setVisibility(i3);
                }
            }
        } else if (!z) {
            Drawable drawable = null;
            if ((obj instanceof C194808jg) && (c194808jg = (C194808jg) obj) != null) {
                drawable = (Drawable) AbstractC001800i.A0A(c194808jg.A05());
            }
            if ((drawable instanceof C74P) && (c74p = (C74P) drawable) != null) {
                c74p.A06();
            }
        }
        super.setVisible(z, false);
        invalidateSelf();
    }

    @Override // X.C5RT
    public final void EYL(BBJ bbj) {
        Object obj = this.A0A;
        if (obj instanceof C5RT) {
            ((C5RT) obj).EYL(bbj);
        }
    }

    @Override // X.C5RO
    public final void Efo(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        Object A08 = A08();
        if (A08 instanceof InterfaceC202998yH) {
            ((InterfaceC202998yH) A08).DtF(this.A01, this.A00);
        }
    }

    @Override // X.C5RQ
    public final void Egu() {
        C74P c74p;
        C194808jg c194808jg;
        Drawable drawable = this.A0A;
        Drawable drawable2 = null;
        if ((drawable instanceof C194808jg) && (c194808jg = (C194808jg) drawable) != null) {
            drawable2 = (Drawable) AbstractC001800i.A0A(c194808jg.A05());
        }
        if ((drawable2 instanceof C74P) && (c74p = (C74P) drawable2) != null) {
            c74p.A06();
        }
    }

    @Override // X.C5RO
    public final String getId() {
        return this.A0B;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A0A.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A0A.getIntrinsicWidth();
    }

    @Override // X.C5RP
    public final boolean isLoading() {
        Object obj = this.A0A;
        if (obj instanceof C5RP) {
            return ((C5RP) obj).isLoading();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        this.A08 = z;
        return super.setVisible(z, z2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5RM(X.C5RM r5, X.C5QI r6, X.C6RB r7) {
        /*
            r4 = this;
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r1 = r0.toString()
            X.C14360o3.A07(r1)
            android.content.Context r0 = r5.A0C
            r4.<init>(r0, r7, r1)
            int r0 = r5.A05
            r4.A05 = r0
            int r0 = r5.A06
            r4.A06 = r0
            boolean r0 = r5.A08
            r4.A08 = r0
            boolean r0 = r5.A09
            r4.A09 = r0
            java.lang.Boolean r0 = r5.A07
            r4.A07 = r0
            java.lang.Integer r0 = r5.A03
            r4.A03 = r0
            java.lang.String r0 = r5.A04
            r4.A04 = r0
            X.9C2 r0 = r5.A02
            java.lang.Object r3 = r0.A00
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Object r2 = r0.A01
            com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption r2 = (com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption) r2
            java.lang.String r1 = r6.A05
            X.9C2 r0 = new X.9C2
            r0.<init>(r2, r3, r1)
            r4.A02 = r0
            int r0 = r5.A01
            r4.A01 = r0
            int r0 = r5.A00
            r4.A00 = r0
            android.text.Spannable r2 = r7.A0F
            android.graphics.drawable.Drawable r1 = r4.A08()
            boolean r0 = r1 instanceof X.C6RB
            if (r0 == 0) goto L5a
            X.6RB r1 = (X.C6RB) r1
            if (r2 != 0) goto L57
            android.text.Spannable r2 = X.C6RB.A0d
        L57:
            r1.A0L(r2)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5RM.<init>(X.5RM, X.5QI, X.6RB):void");
    }

    @Override // X.C5RO
    public final Integer B0L() {
        if (A08() instanceof C6RB) {
            Drawable drawable = this.A0A;
            if (!(drawable instanceof C194808jg) || !(((C194808jg) drawable).A03 instanceof C217839kG)) {
                return C05F.A00;
            }
        }
        return C05F.A01;
    }

    @Override // X.C5RO
    public final Spannable C5r() {
        Drawable A08 = A08();
        if (A08 instanceof C6RB) {
            return ((C6RB) A08).A0F;
        }
        if (A08 instanceof C202308xA) {
            return new SpannableString(((C202308xA) A08).A03);
        }
        return null;
    }

    @Override // X.C5RO
    public final EnumC53185Nfh CBd() {
        Drawable A08 = A08();
        if (!(A08 instanceof C202718xp)) {
            if (A08 instanceof C6RB) {
                Drawable drawable = this.A0A;
                if (!(drawable instanceof C194808jg) || !(((C194808jg) drawable).A03 instanceof C217839kG)) {
                    return EnumC53185Nfh.A09;
                }
            } else {
                if (A08 instanceof C5RU) {
                    return EnumC53185Nfh.A03;
                }
                if (A08 instanceof C202308xA) {
                    return EnumC53185Nfh.A05;
                }
                if ((A08 instanceof C210459Sk) && ((C210459Sk) A08).A04 == EnumC222859sQ.A04) {
                    return EnumC53185Nfh.A02;
                }
            }
        }
        return EnumC53185Nfh.A07;
    }

    @Override // X.C5RO
    public final void EgI(C9C2 c9c2) {
        this.A02 = c9c2;
    }

    public C5RM(Context context, Drawable drawable, String str) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(drawable, 2);
        C14360o3.A0B(context, 3);
        this.A0B = str;
        this.A0A = drawable;
        this.A0C = context;
        this.A05 = -1;
        this.A08 = true;
        this.A02 = new C9C2(C05F.A00);
        this.A01 = -1;
        this.A00 = -1;
        this.A0A.setCallback(this);
    }
}
