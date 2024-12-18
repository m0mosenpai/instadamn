package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.4oS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105124oS {
    public static final C105124oS A00 = new Object();

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
    public static final void A00(Context context, TextView textView, InterfaceC11380iw interfaceC11380iw, final UserSession userSession, C77143d0 c77143d0, C77613dl c77613dl, C43Q c43q, C76293bZ c76293bZ, final InterfaceC75453aC interfaceC75453aC, C76743cM c76743cM, final C75113Zb c75113Zb, int i) {
        boolean z;
        CharSequence charSequence;
        int i2;
        SpannableStringBuilder spannableStringBuilder;
        CharSequence AyG;
        String str;
        boolean z2;
        C92584Cs c92584Cs;
        switch (c43q.ordinal()) {
            case 0:
                boolean z3 = c76293bZ.A05;
                i2 = 0;
                C14360o3.A0B(textView, 1);
                spannableStringBuilder = new SpannableStringBuilder();
                AbstractC33786EwC.A00(context, spannableStringBuilder, userSession, new C9F4(36, c77613dl, c76743cM), c77143d0.A04, z3);
                textView.setVisibility(i2);
                textView.setText(spannableStringBuilder);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            case 1:
                AbstractC13880nE.A0P(textView);
                return;
            case 2:
                C76683cG c76683cG = c77613dl.A00;
                C38321qM c38321qM = c76743cM.A02.A01;
                boolean z4 = c76743cM.A0B;
                InterfaceC09390do interfaceC09390do = c76683cG.A02;
                interfaceC09390do.getValue();
                final C115015Hw A002 = C115005Hv.A00(c76683cG.A00, c38321qM, z4);
                final C115025Hx c115025Hx = new C115025Hx((C115005Hv) interfaceC09390do.getValue());
                C14360o3.A0B(textView, 5);
                textView.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) A002.A07);
                if (AbstractC115035Hy.A02(userSession, A002)) {
                    spannableStringBuilder2.append((CharSequence) context.getString(2131961132));
                    AbstractC115035Hy.A01(spannableStringBuilder2, c115025Hx, A002, c75113Zb);
                }
                if (A002.A0B) {
                    spannableStringBuilder2.append((CharSequence) context.getString(2131961132));
                    AbstractC115035Hy.A00(spannableStringBuilder2, c115025Hx, A002, c75113Zb);
                }
                textView.setTextColor(c77143d0.A07);
                if (A002.A0E) {
                    spannableStringBuilder2.append((CharSequence) context.getString(2131961132));
                    int i3 = c77143d0.A04;
                    C115005Hv c115005Hv = c115025Hx.A00;
                    AbstractC27679CIy.A00(spannableStringBuilder2, c115005Hv.A00, A002.A00, c115005Hv.A01, i3);
                    textView.setText(spannableStringBuilder2);
                } else {
                    if (A002.A0D) {
                        spannableStringBuilder2.append((CharSequence) context.getString(2131961132));
                        str = A002.A04;
                    } else if (A002.A0C) {
                        spannableStringBuilder2.append((CharSequence) context.getString(2131961132));
                        str = A002.A03;
                    } else {
                        final ViewOnClickListenerC77633dn viewOnClickListenerC77633dn = new ViewOnClickListenerC77633dn(userSession, null, new D8M(47, c75113Zb, A002), new C50364MLq(c115025Hx, A002, c75113Zb, 36), true);
                        spannableStringBuilder2.setSpan(new ClickableSpan() { // from class: X.60O
                            @Override // android.text.style.ClickableSpan
                            public final void onClick(View view) {
                                C14360o3.A0B(view, 0);
                                if (C18U.A06(C06090Tz.A05, userSession, 36320545557521056L)) {
                                    viewOnClickListenerC77633dn.onClick(view);
                                } else {
                                    c115025Hx.A00(A002, c75113Zb);
                                }
                            }

                            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                            public final void updateDrawState(TextPaint textPaint) {
                                C14360o3.A0B(textPaint, 0);
                                textPaint.setUnderlineText(false);
                            }
                        }, 0, spannableStringBuilder2.length(), 33);
                    }
                    spannableStringBuilder2.append((CharSequence) str);
                }
                textView.setText(spannableStringBuilder2);
                textView.setSingleLine(false);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                AbstractC77703du.A05(textView, EnumC77673dr.A0S);
                return;
            case 3:
                MUG A003 = C76683cG.A00(context, c76743cM.A02.A01);
                textView.setVisibility(0);
                textView.setText((CharSequence) A003.A00);
                AbstractC55150OdD.A01(textView);
                C0fQ.A00(new ViewOnClickListenerC41965Iiw(A003, interfaceC75453aC, c75113Zb, i), textView);
                if (!A003.A01) {
                    A003.A01 = true;
                    LL0.A00(interfaceC11380iw, userSession, ((C76733cL) A003.A03).A00, C05F.A0C);
                }
                textView.setOnTouchListener(new ViewOnTouchListenerC42052IkL(A003, interfaceC75453aC));
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setTextColor(c77143d0.A04);
                return;
            case 4:
                boolean z5 = c76743cM.A0F;
                Integer num = c76743cM.A07;
                Venue venue = c76743cM.A05;
                if (venue != null) {
                    String name = venue.A00.getName();
                    C76733cL c76733cL = c76743cM.A06;
                    C14360o3.A0B(num, 2);
                    C14360o3.A0B(textView, 4);
                    C14360o3.A0B(c76733cL, 6);
                    textView.setVisibility(0);
                    spannableStringBuilder = new SpannableStringBuilder();
                    AbstractC89383ye.A0B(spannableStringBuilder, interfaceC75453aC, c76733cL, num, name, c77143d0.A08, c77143d0.A04, z5);
                    textView.setText(spannableStringBuilder);
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            case 5:
                C76683cG c76683cG2 = c77613dl.A00;
                C38321qM c38321qM2 = c76743cM.A02.A01;
                C51761Mtk A02 = c76683cG2.A02(context, c38321qM2, c77143d0, c76743cM.A04);
                boolean z6 = false;
                textView.setVisibility(0);
                if (A02 != null) {
                    C105154oV c105154oV = new C105154oV(textView, false);
                    C92584Cs c92584Cs2 = (C92584Cs) A02.A02;
                    C92594Ct.A05(userSession, (InterfaceC105144oU) A02.A00, c105154oV, c92584Cs2);
                    if (c92584Cs2 != null) {
                        z6 = c92584Cs2.A05;
                    }
                }
                interfaceC75453aC.D4z(c38321qM2, z6);
                textView.setTextColor(c77143d0.A04);
                return;
            case 6:
                InterfaceC109904xI interfaceC109904xI = c76743cM.A01;
                C14360o3.A0B(textView, 0);
                textView.setVisibility(0);
                if (interfaceC109904xI != null && (AyG = interfaceC109904xI.AyG()) != null) {
                    textView.setText(AyG);
                }
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setTextColor(c77143d0.A04);
                return;
            case 7:
                textView.setVisibility(0);
                textView.setText(C37855Gl9.A00(context, c76743cM.A02.A01));
                C0fQ.A00(new ViewOnClickListenerC48044LOq(c77613dl, c76743cM), textView);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setTextColor(c77143d0.A04);
                return;
            case 8:
                C76683cG c76683cG3 = c77613dl.A00;
                C38321qM c38321qM3 = c76743cM.A02.A01;
                final C51761Mtk A01 = c76683cG3.A01(context, c38321qM3, c77143d0);
                if (A01 != null && (c92584Cs = (C92584Cs) A01.A02) != null) {
                    z2 = c92584Cs.A05;
                } else {
                    z2 = false;
                }
                interfaceC75453aC.D4z(c38321qM3, z2);
                C14360o3.A0B(textView, 2);
                textView.setVisibility(0);
                textView.setTextColor(c77143d0.A04);
                if (A01 == null) {
                    return;
                }
                C92594Ct.A05(userSession, new InterfaceC105144oU() { // from class: X.4oT
                    @Override // X.InterfaceC105144oU
                    public final void DUB(View view) {
                        C128865s0 c128865s0;
                        MusicInfo musicInfo;
                        C38321qM c38321qM4 = ((C76733cL) C51761Mtk.this.A00).A00;
                        InterfaceC75453aC interfaceC75453aC2 = interfaceC75453aC;
                        C75113Zb c75113Zb2 = c75113Zb;
                        if (c38321qM4.A50()) {
                            c128865s0 = new C128865s0(C41676Id5.A00());
                            c128865s0.A09 = c38321qM4.A1K();
                        } else {
                            C88543xC A1Q = c38321qM4.A1Q();
                            c128865s0 = new C128865s0(CMG.A00);
                            if (A1Q != null) {
                                musicInfo = A1Q.A00;
                            } else {
                                musicInfo = null;
                            }
                            c128865s0.A08 = musicInfo;
                        }
                        interfaceC75453aC2.D4x(C8JW.A0N, c128865s0.A00(), c38321qM4, c75113Zb2);
                    }

                    @Override // X.InterfaceC105144oU
                    public final View.OnTouchListener DUD() {
                        return interfaceC75453aC.D4y(((C76733cL) C51761Mtk.this.A00).A00);
                    }
                }, new C105154oV(textView, true), (C92584Cs) A01.A02);
                return;
            case 9:
                c77613dl.A00(context, c76743cM);
                i2 = 0;
                C14360o3.A0B(textView, 0);
                spannableStringBuilder = new SpannableStringBuilder();
                int i4 = c77143d0.A04;
                C76683cG c76683cG4 = c77613dl.A00;
                AbstractC27679CIy.A00(spannableStringBuilder, c76683cG4.A00, c76743cM.A02.A01, c76683cG4.A01, i4);
                textView.setVisibility(i2);
                textView.setText(spannableStringBuilder);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            case 10:
            case Process.SIGSTOP /* 19 */:
            default:
                return;
            case 11:
                C14360o3.A0B(textView, 1);
                textView.setVisibility(0);
                spannableStringBuilder = new SpannableStringBuilder();
                AbstractC89383ye.A03(context, spannableStringBuilder, c77143d0.A04);
                textView.setText(spannableStringBuilder);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                String str2 = c76743cM.A08;
                i2 = 0;
                C14360o3.A0B(textView, 1);
                spannableStringBuilder = new SpannableStringBuilder();
                AbstractC89383ye.A09(context, spannableStringBuilder, c77613dl, c76743cM, str2, c77143d0.A04);
                textView.setVisibility(i2);
                textView.setText(spannableStringBuilder);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C14360o3.A0B(textView, 1);
                textView.setVisibility(0);
                spannableStringBuilder = new SpannableStringBuilder();
                AbstractC89383ye.A02(context, spannableStringBuilder, c77143d0.A04);
                textView.setText(spannableStringBuilder);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            case 14:
                C38321qM c38321qM4 = c76743cM.A06.A00;
                i2 = 0;
                C14360o3.A0B(textView, 1);
                spannableStringBuilder = new SpannableStringBuilder();
                AbstractC89383ye.A05(context, spannableStringBuilder, c38321qM4, c77613dl, c76743cM, c77143d0.A04, textView.getLineHeight());
                textView.setVisibility(i2);
                textView.setText(spannableStringBuilder);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            case Process.SIGTERM /* 15 */:
                String str3 = c76743cM.A08;
                i2 = 0;
                C14360o3.A0B(textView, 1);
                spannableStringBuilder = new SpannableStringBuilder();
                AbstractC89383ye.A0A(context, spannableStringBuilder, c77613dl, str3, c77143d0.A04, textView.getLineHeight());
                textView.setVisibility(i2);
                textView.setText(spannableStringBuilder);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            case 16:
                String moduleName = interfaceC11380iw.getModuleName();
                C38321qM c38321qM5 = c76743cM.A06.A00;
                i2 = 0;
                C14360o3.A0B(moduleName, 2);
                C14360o3.A0B(textView, 4);
                spannableStringBuilder = new SpannableStringBuilder();
                AbstractC89383ye.A04(context, spannableStringBuilder, userSession, c38321qM5, c77613dl, c76743cM, moduleName, c77143d0.A04, textView.getLineHeight());
                textView.setVisibility(i2);
                textView.setText(spannableStringBuilder);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            case 17:
                C38321qM c38321qM6 = c76743cM.A06.A00;
                i2 = 0;
                C14360o3.A0B(textView, 1);
                spannableStringBuilder = new SpannableStringBuilder();
                AbstractC89383ye.A06(context, spannableStringBuilder, c38321qM6, interfaceC75453aC, c75113Zb, c77143d0.A04);
                textView.setVisibility(i2);
                textView.setText(spannableStringBuilder);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            case 18:
                C38321qM c38321qM7 = c76743cM.A06.A00;
                z = false;
                C14360o3.A0B(textView, 1);
                textView.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                int i5 = c77143d0.A04;
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(C23831Eq.A03(context, c38321qM7.A1B()));
                spannableStringBuilder4.setSpan(new ForegroundColorSpan(i5), 0, spannableStringBuilder4.length(), 33);
                spannableStringBuilder3.append((CharSequence) spannableStringBuilder4);
                charSequence = spannableStringBuilder3;
                textView.setText(charSequence);
                textView.setClickable(z);
                return;
            case 20:
                C38321qM c38321qM8 = c76743cM.A06.A00;
                z = false;
                C14360o3.A0B(textView, 0);
                textView.setVisibility(0);
                Context context2 = textView.getContext();
                C14360o3.A07(context2);
                charSequence = AbstractC27680CIz.A00(context2, userSession, c38321qM8);
                textView.setText(charSequence);
                textView.setClickable(z);
                return;
            case 21:
                i2 = 0;
                C14360o3.A0B(textView, 1);
                spannableStringBuilder = new SpannableStringBuilder();
                AbstractC89383ye.A08(context, spannableStringBuilder, c77613dl, c76743cM, c77143d0.A04, textView.getLineHeight());
                textView.setVisibility(i2);
                textView.setText(spannableStringBuilder);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            case 22:
                C38321qM c38321qM9 = c76743cM.A06.A00;
                C14360o3.A0B(textView, 0);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                InterfaceC43580JMo CHL = c38321qM9.A0C.CHL();
                spannableStringBuilder5.append((CharSequence) (CHL != null ? CHL.getAttributionTitle() : null));
                textView.setVisibility(0);
                textView.setText(spannableStringBuilder5);
                return;
            case 23:
                String str4 = c76743cM.A08;
                i2 = 0;
                C14360o3.A0B(textView, 1);
                spannableStringBuilder = new SpannableStringBuilder();
                int i6 = c77143d0.A04;
                int lineHeight = textView.getLineHeight();
                if (spannableStringBuilder.length() != 0) {
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) " • ");
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(i6), length, spannableStringBuilder.length(), 0);
                }
                Drawable drawable = context.getDrawable(R.drawable.instagram_app_horizon_pano_filled_24);
                if (drawable != null) {
                    Drawable mutate = drawable.mutate();
                    if (mutate != null) {
                        mutate.setColorFilter(C3DY.A00(i6));
                    }
                    drawable.setBounds(0, 0, lineHeight, lineHeight);
                }
                C44392JjV c44392JjV = new C44392JjV(c77613dl, c76743cM, i6);
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) " ");
                if (drawable != null) {
                    C85973sR c85973sR = new C85973sR(drawable);
                    int i7 = length2 + 1;
                    spannableStringBuilder.setSpan(c85973sR, length2, i7, 33);
                    spannableStringBuilder.append((CharSequence) " ");
                    spannableStringBuilder.append((CharSequence) str4);
                    spannableStringBuilder.setSpan(c44392JjV, i7, spannableStringBuilder.length(), 33);
                    textView.setVisibility(i2);
                    textView.setText(spannableStringBuilder);
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            case 24:
                C76623c7 c76623c7 = c76743cM.A02;
                int position = c75113Zb.getPosition();
                C14360o3.A0B(textView, 2);
                C14360o3.A0B(c76623c7, 3);
                C38321qM c38321qM10 = c76623c7.A01;
                CharSequence A03 = C76263bW.A00.A03(context, c38321qM10);
                textView.setVisibility(0);
                textView.setText(A03);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                AbstractC37670Gi3.A0T(null, interfaceC11380iw, userSession, Integer.valueOf(position), c38321qM10.A2u(), true);
                return;
        }
    }
}
