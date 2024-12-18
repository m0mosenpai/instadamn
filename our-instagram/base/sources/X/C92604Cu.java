package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import com.facebook.R;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.OriginalPartsAttributionModel;
import java.util.List;

/* renamed from: X.4Cu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92604Cu {
    public static final C92604Cu A00 = new Object();

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.text.SpannableStringBuilder A02(android.content.Context r10, com.instagram.common.session.UserSession r11, X.C92584Cs r12) {
        /*
            r3 = 0
            r8 = r11
            X.C14360o3.A0B(r11, r3)
            r0 = 2
            r9 = r12
            X.C14360o3.A0B(r12, r0)
            android.graphics.drawable.Drawable r5 = A01(r10, r12)
            android.graphics.drawable.Drawable r6 = A00(r10, r12)
            android.content.res.Resources r4 = r10.getResources()
            boolean r0 = r12.A05
            if (r0 == 0) goto L27
            r0 = 2131953326(0x7f1306ae, float:1.954312E38)
            java.lang.String r0 = r4.getString(r0)
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>(r0)
            return r7
        L27:
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>()
            boolean r0 = r12.A0A
            if (r0 == 0) goto L50
            java.lang.Integer r1 = X.C05F.A00
            r0 = 2131231419(0x7f0802bb, float:1.8078918E38)
        L35:
            android.graphics.drawable.Drawable r1 = X.C92594Ct.A00(r10, r1, r0)
        L39:
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            A05(r10, r1, r7, r12, r0)
            X.9Bg r0 = r12.A01
            if (r0 == 0) goto L63
            java.lang.Object r1 = r0.A03
            com.instagram.api.schemas.OriginalAudioSubtype r0 = com.instagram.api.schemas.OriginalAudioSubtype.A05
            if (r1 == r0) goto L63
            X.C14360o3.A0A(r4)
            A07(r4, r5, r6, r7, r8, r9)
            return r7
        L50:
            boolean r0 = r12.A06
            X.4Ct r1 = X.C92594Ct.A00
            if (r0 == 0) goto L5d
            java.lang.Integer r0 = X.C05F.A00
            android.graphics.drawable.BitmapDrawable r1 = r1.A07(r10, r0)
            goto L39
        L5d:
            java.lang.Integer r1 = X.C05F.A00
            r0 = 2131238642(0x7f081ef2, float:1.8093568E38)
            goto L35
        L63:
            java.lang.String r0 = r12.A03
            r7.append(r0)
            boolean r0 = r12.A0B
            if (r0 == 0) goto L7a
            X.6Pm r2 = new X.6Pm
            r2.<init>()
            int r1 = r7.length()
            r0 = 33
            r7.setSpan(r2, r3, r1, r0)
        L7a:
            int r0 = r7.length()
            if (r0 <= 0) goto L85
            java.lang.String r0 = " • "
            r7.append(r0)
        L85:
            java.lang.String r0 = r12.A04
            r7.append(r0)
            boolean r0 = r12.A07
            if (r0 == 0) goto L96
            if (r5 == 0) goto L96
            X.C14360o3.A0A(r4)
            A0B(r4, r5, r7, r3)
        L96:
            X.C14360o3.A0A(r4)
            A0A(r4, r6, r7, r12)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92604Cu.A02(android.content.Context, com.instagram.common.session.UserSession, X.4Cs):android.text.SpannableStringBuilder");
    }

    public static final SpannableStringBuilder A03(Resources resources, Drawable drawable, Drawable drawable2, UserSession userSession, C92584Cs c92584Cs, boolean z) {
        Object obj;
        List list;
        C14360o3.A0B(c92584Cs, 2);
        if (c92584Cs.A05) {
            return new SpannableStringBuilder(resources.getString(2131953326));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        C92604Cu c92604Cu = A00;
        C206239Bg c206239Bg = c92584Cs.A01;
        if (c206239Bg != null) {
            obj = c206239Bg.A03;
        } else {
            obj = null;
        }
        if (obj == OriginalAudioSubtype.A06 && C18U.A06(C06090Tz.A05, userSession, 36321353011504468L)) {
            if (z) {
                if (c206239Bg == null) {
                    return spannableStringBuilder;
                }
                c92604Cu.A09(resources, drawable, spannableStringBuilder, c206239Bg);
                return spannableStringBuilder;
            }
            if (c206239Bg == null || (list = (List) c206239Bg.A04) == null) {
                return spannableStringBuilder;
            }
            OriginalPartsAttributionModel originalPartsAttributionModel = (OriginalPartsAttributionModel) AbstractC001800i.A0J(list);
            int size = list.size() - 1;
            if (originalPartsAttributionModel == null || size < 0) {
                return spannableStringBuilder;
            }
            String A04 = A04(originalPartsAttributionModel.A01, originalPartsAttributionModel.A02);
            if (A04.length() > 38) {
                StringBuilder sb = new StringBuilder();
                sb.append(A04.subSequence(0, 38));
                sb.append("…");
                A04 = sb.toString();
                C14360o3.A07(A04);
            }
            if (size == 0) {
                spannableStringBuilder.append((CharSequence) A04);
                return spannableStringBuilder;
            }
            spannableStringBuilder.append((CharSequence) resources.getQuantityString(R.plurals.audio_mix_attribution_abbreviated, size, A04, Integer.valueOf(size)));
            return spannableStringBuilder;
        }
        if (c206239Bg != null && c206239Bg.A03 != OriginalAudioSubtype.A05) {
            A07(resources, drawable, drawable2, spannableStringBuilder, userSession, c92584Cs);
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) c92584Cs.A03);
        if (c92584Cs.A0B) {
            spannableStringBuilder.setSpan(new CharacterStyle(), 0, spannableStringBuilder.length(), 33);
        }
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append((CharSequence) " • ");
        }
        spannableStringBuilder.append((CharSequence) c92584Cs.A04);
        if (c92584Cs.A07 && drawable != null) {
            A0B(resources, drawable, spannableStringBuilder, false);
        }
        A0A(resources, drawable2, spannableStringBuilder, c92584Cs);
        return spannableStringBuilder;
    }

    public static final String A04(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        if (!(!AbstractC001900j.A0T(str)) || !(!AbstractC001900j.A0T(str2))) {
            z = false;
        }
        sb.append(str);
        if (z) {
            sb.append(" • ");
        }
        sb.append(str2);
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public static final void A06(Context context, Drawable drawable, C92584Cs c92584Cs) {
        Drawable mutate;
        int A0H;
        if (c92584Cs.A09) {
            if (drawable != null && (mutate = drawable.mutate()) != null) {
                A0H = R.color.audio_bar_action_color_enabled;
            } else {
                return;
            }
        } else if (drawable == null || (mutate = drawable.mutate()) == null) {
            return;
        } else {
            A0H = AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text);
        }
        mutate.setColorFilter(context.getColor(A0H), PorterDuff.Mode.SRC_IN);
    }

    public static final void A07(Resources resources, Drawable drawable, Drawable drawable2, SpannableStringBuilder spannableStringBuilder, UserSession userSession, C92584Cs c92584Cs) {
        C206239Bg c206239Bg = c92584Cs.A01;
        if (c206239Bg != null) {
            spannableStringBuilder.append((CharSequence) c92584Cs.A03);
            if (c92584Cs.A0B) {
                spannableStringBuilder.setSpan(new CharacterStyle(), 0, spannableStringBuilder.length(), 33);
            }
            spannableStringBuilder.append(" • ");
            spannableStringBuilder.append((CharSequence) c92584Cs.A04);
            if (c92584Cs.A07 && drawable != null) {
                spannableStringBuilder.append("  ");
                A08(resources, drawable, spannableStringBuilder);
                spannableStringBuilder.append(" ");
            }
            Object obj = c206239Bg.A03;
            if (obj == OriginalAudioSubtype.A06) {
                spannableStringBuilder.append(":  ");
                A00.A09(resources, drawable, spannableStringBuilder, c206239Bg);
            } else if (obj == OriginalAudioSubtype.A04) {
                List list = (List) c206239Bg.A00;
                if (!list.isEmpty() && C18U.A06(C06090Tz.A05, userSession, 36328680225521370L)) {
                    spannableStringBuilder.append(" ");
                    int i = 2131967999;
                    if (c206239Bg.A01) {
                        i = 2131968000;
                    }
                    spannableStringBuilder.append((CharSequence) resources.getString(i, ((OriginalPartsAttributionModel) AbstractC001800i.A0I(list)).A02));
                }
            }
            A0A(resources, drawable2, spannableStringBuilder, c92584Cs);
        }
    }

    public static final void A08(Resources resources, Drawable drawable, SpannableStringBuilder spannableStringBuilder) {
        C85973sR c85973sR = new C85973sR(drawable);
        drawable.setBounds(0, 0, resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap));
        c85973sR.A02 = C05F.A01;
        int length = spannableStringBuilder.length();
        spannableStringBuilder.insert(length, "  ");
        spannableStringBuilder.setSpan(c85973sR, length, length + 2, 33);
    }

    private final void A09(Resources resources, Drawable drawable, SpannableStringBuilder spannableStringBuilder, C206239Bg c206239Bg) {
        List list = (List) c206239Bg.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            OriginalPartsAttributionModel originalPartsAttributionModel = (OriginalPartsAttributionModel) list.get(i);
            String str = originalPartsAttributionModel.A01;
            String str2 = originalPartsAttributionModel.A02;
            boolean z = originalPartsAttributionModel.A03;
            if (i > 0) {
                spannableStringBuilder.append("  |  ");
            }
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.append(" • ");
            spannableStringBuilder.append((CharSequence) str2);
            if (z && drawable != null) {
                spannableStringBuilder.append("  ");
                A08(resources, drawable, spannableStringBuilder);
            }
        }
    }

    public static final void A0A(Resources resources, Drawable drawable, SpannableStringBuilder spannableStringBuilder, C92584Cs c92584Cs) {
        String additionalAudioUsername;
        InterfaceC84033on interfaceC84033on = c92584Cs.A02;
        if (interfaceC84033on != null && (additionalAudioUsername = interfaceC84033on.getAdditionalAudioUsername()) != null && additionalAudioUsername.length() != 0) {
            spannableStringBuilder.append(" |");
            if (drawable != null) {
                A0B(resources, drawable, spannableStringBuilder, true);
            }
            spannableStringBuilder.append((CharSequence) additionalAudioUsername);
        }
    }

    public static final Drawable A00(Context context, C92584Cs c92584Cs) {
        Drawable drawable = context.getDrawable(R.drawable.instagram_microphone_filled_12);
        A06(context, drawable, c92584Cs);
        return drawable;
    }

    public static final Drawable A01(Context context, C92584Cs c92584Cs) {
        Drawable drawable = context.getDrawable(R.drawable.music_explicit);
        A06(context, drawable, c92584Cs);
        return drawable;
    }

    public static final void A05(Context context, Drawable drawable, SpannableStringBuilder spannableStringBuilder, C92584Cs c92584Cs, int i) {
        drawable.setBounds(0, 0, context.getResources().getDimensionPixelSize(i), context.getResources().getDimensionPixelSize(i));
        A06(context, drawable, c92584Cs);
        C4GL.A02(drawable, spannableStringBuilder, 0, 0, context.getResources().getDimensionPixelSize(R.dimen.accent_edge_thickness));
    }

    public static final void A0B(Resources resources, Drawable drawable, SpannableStringBuilder spannableStringBuilder, boolean z) {
        int i = 0;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.accent_edge_thickness);
        int length = spannableStringBuilder.length();
        if (z) {
            i = dimensionPixelSize;
        }
        C4GL.A02(drawable, spannableStringBuilder, length, dimensionPixelSize, i);
    }
}
