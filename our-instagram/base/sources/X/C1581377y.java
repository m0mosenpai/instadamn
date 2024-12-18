package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.Base64;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.77y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1581377y {
    public static final C1581377y A00 = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r14v2, types: [android.text.SpannableStringBuilder] */
    public final CharSequence A00(Context context, AbstractC46363Kfl abstractC46363Kfl, UserSession userSession, CharSequence charSequence) {
        Spannable spannable;
        SpannableString spannableString;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(charSequence, 2);
        if (abstractC46363Kfl == null) {
            if (C18U.A06(C06090Tz.A06, userSession, 36330385327604566L)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("_");
                if (charSequence instanceof Spannable) {
                    spannableString = charSequence;
                } else {
                    spannableString = new SpannableString(charSequence);
                }
                charSequence = spannableStringBuilder.append((CharSequence) spannableString);
                Drawable drawable = context.getDrawable(R.drawable.ig_badge_color_logo);
                if (drawable != null) {
                    charSequence.setSpan(new ImageSpan(drawable), 0, 1, 33);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        } else if (VNC.A00(abstractC46363Kfl, charSequence) && C18U.A06(C06090Tz.A05, userSession, 36330385327539029L)) {
            if (VNC.A00(abstractC46363Kfl, charSequence)) {
                HashMap hashMap = new HashMap();
                if (charSequence instanceof Spannable) {
                    spannable = (Spannable) charSequence;
                } else {
                    spannable = null;
                }
                if (spannable == null) {
                    spannable = new SpannableString(charSequence);
                }
                C67640Utv c67640Utv = (C67640Utv) abstractC46363Kfl;
                List list = c67640Utv.A01;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C67642Utx c67642Utx = (C67642Utx) ((VIQ) it.next());
                        String str = c67642Utx.A02;
                        Bitmap bitmap = (Bitmap) hashMap.get(str);
                        if (bitmap == null) {
                            try {
                                List list2 = c67640Utv.A00;
                                if (list2 != null) {
                                    Iterator it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        C67641Utw c67641Utw = (C67641Utw) ((VIP) it2.next());
                                        if (C14360o3.A0K(c67641Utw.A02, str)) {
                                            byte[] decode = Base64.decode(c67641Utw.A01, 0);
                                            bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                                            if (str != null) {
                                                if (bitmap != null) {
                                                    hashMap.put(str, bitmap);
                                                }
                                            } else {
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                        }
                                    }
                                    throw new NoSuchElementException(MSV.A00(1));
                                }
                                throw new IllegalStateException("Required value was null.");
                            } catch (Exception unused) {
                            }
                        }
                        ImageSpan imageSpan = new ImageSpan(context, bitmap);
                        Integer num = c67642Utx.A01;
                        if (num != null) {
                            int intValue = num.intValue();
                            Integer num2 = c67642Utx.A00;
                            if (num2 != null) {
                                spannable.setSpan(imageSpan, intValue, intValue + num2.intValue(), 33);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    return spannable;
                }
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            return charSequence;
        }
        return charSequence;
    }
}
