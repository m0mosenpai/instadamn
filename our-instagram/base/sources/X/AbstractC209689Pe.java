package X;

import android.content.Context;
import android.graphics.PointF;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.EditText;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.ui.text.ConstrainedEditText;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.9Pe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC209689Pe {
    public static final Pattern A00 = Pattern.compile("\\B@([a-zA-Z0-9\\_]+(\\.[a-zA-Z0-9\\_]+)*)");

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        return android.text.Layout.Alignment.ALIGN_NORMAL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        return android.text.Layout.Alignment.ALIGN_OPPOSITE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0018, code lost:
    
        if (r2.A0O != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r2.A0O != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.Layout.Alignment A00(X.C6RB r2, java.lang.Integer r3) {
        /*
            int[] r0 = X.AbstractC22787A3f.A00
            int r1 = r3.intValue()
            r0 = 0
            if (r1 == r0) goto L16
            r0 = 1
            if (r1 == r0) goto L2c
            r0 = 2
            if (r1 != r0) goto L1d
            boolean r0 = r2.A0O
            if (r0 == 0) goto L1a
        L13:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r0
        L16:
            boolean r0 = r2.A0O
            if (r0 == 0) goto L13
        L1a:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r0
        L1d:
            java.lang.String r1 = "Unknown alignment: "
            java.lang.String r0 = X.AbstractC23070AFc.A00(r3)
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        L2c:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC209689Pe.A00(X.6RB, java.lang.Integer):android.text.Layout$Alignment");
    }

    public static void A03(Layout layout, Spannable spannable, Integer num, float f) {
        for (C6S0 c6s0 : (C6S0[]) C4GL.A06(spannable, C6S0.class)) {
            c6s0.FCG(layout, num, f, spannable.getSpanStart(c6s0), spannable.getSpanEnd(c6s0));
        }
    }

    public static void A0A(C6RB c6rb) {
        Spannable spannable = c6rb.A0F;
        if (!TextUtils.isEmpty(spannable)) {
            String obj = spannable.toString();
            if (!c6rb.A0O) {
                if (AbstractC13620mo.A01() || AbstractC13620mo.A03(obj)) {
                    c6rb.A0O = true;
                }
            }
        }
    }

    public static ArrayList A01(UserSession userSession, String str) {
        C18A A002 = AnonymousClass189.A00(userSession);
        ArrayList A1E = AbstractC166987dD.A1E();
        Matcher matcher = A00.matcher(str);
        while (matcher.find()) {
            Object obj = A002.A02.get(matcher.group().substring(1));
            if (obj != null) {
                A1E.add(obj);
            }
        }
        return A1E;
    }

    public static void A02(Context context, EditText editText) {
        Editable text = editText.getText();
        C14360o3.A0A(text);
        AbstractC190978ct.A03(text);
        editText.invalidate();
        AbstractC139116Rs.A00(editText, AbstractC167017dG.A08(context), true);
    }

    public static void A04(ViewGroup viewGroup, C202848y2 c202848y2, C194918js c194918js, ConstrainedEditText constrainedEditText, boolean z, boolean z2) {
        if (c194918js.A07().A0D) {
            C14360o3.A0B(viewGroup, 0);
            if (AbstractC209699Pf.A01()) {
                C202848y2.A00(viewGroup, c202848y2, false, z, z2);
                c202848y2.A00 = true;
            }
            UserSession userSession = c202848y2.A03;
            if (z) {
                C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                if (!AbstractC167017dG.A1b(A002, A002.A5M, C23031Ai.A8c, 57)) {
                    C202848y2.A00(viewGroup, c202848y2, true, true, z2);
                }
            } else if (C18U.A06(C06090Tz.A05, userSession, 36320670111638314L)) {
                C23031Ai A003 = AbstractC23021Ah.A00(userSession);
                if (!AbstractC167017dG.A1b(A003, A003.A5N, C23031Ai.A8c, 58)) {
                    C202848y2.A00(viewGroup, c202848y2, true, false, z2);
                }
            }
            AbstractC167007dF.A0y(c202848y2.A01, false);
            c202848y2.A02(AbstractC190978ct.A05(constrainedEditText.getText()));
            return;
        }
        AbstractC166997dE.A1L(c202848y2.A01, false);
    }

    public static void A05(EditText editText, Object obj, String str, char c) {
        Object v78;
        Editable text = editText.getText();
        int selectionEnd = editText.getSelectionEnd();
        for (int i = selectionEnd - 1; i >= 0; i--) {
            if (text.charAt(i) == c) {
                editText.clearComposingText();
                if (obj instanceof User) {
                    v78 = new C202858y3(editText.getResources(), (User) obj);
                } else if (obj instanceof Hashtag) {
                    v78 = new V78(editText.getResources(), (Hashtag) obj);
                } else {
                    throw AbstractC166987dD.A1D(AbstractC111324zv.A00(1844));
                }
                int length = str.length() + i + 1;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
                for (AbstractC202868y4 abstractC202868y4 : (AbstractC202868y4[]) spannableStringBuilder.getSpans(i, selectionEnd, AbstractC202868y4.class)) {
                    spannableStringBuilder.removeSpan(abstractC202868y4);
                }
                spannableStringBuilder.replace(i + 1, selectionEnd, (CharSequence) AnonymousClass001.A0R(str, " "));
                spannableStringBuilder.setSpan(v78, i, length, 33);
                editText.setText(spannableStringBuilder);
                editText.setSelection(Math.min(length + 1, editText.getText().length()));
                return;
            }
        }
    }

    public static void A06(C194918js c194918js, C150286pc c150286pc, boolean z) {
        if (c194918js.A07().A0C) {
            AbstractC167007dF.A0y(((ACN) c150286pc.get()).A06, z);
            ((ACN) c150286pc.get()).A01(false);
        } else {
            if (!c150286pc.A03) {
                return;
            }
            AbstractC166997dE.A1L(((ACN) c150286pc.get()).A06, z);
        }
    }

    public static void A07(ConstrainedEditText constrainedEditText, C190888ck c190888ck, C6RB c6rb, float f) {
        Context context = constrainedEditText.getContext();
        constrainedEditText.setTextSize(f);
        if (c6rb != null) {
            Editable text = constrainedEditText.getText();
            c6rb.A0C(AHV.A00(context, text, c190888ck, c6rb, f), AHV.A01(context, text, c190888ck, c6rb, f));
        }
    }

    public static void A08(ConstrainedEditText constrainedEditText, C190888ck c190888ck, C6RB c6rb, InteractiveDrawableContainer interactiveDrawableContainer, Integer num, Map map) {
        Context context = constrainedEditText.getContext();
        C190958cr c190958cr = c190888ck.A06;
        int A002 = c190958cr.A00(context);
        C14360o3.A0B(context, 1);
        int A01 = (int) (((1.0f - c190958cr.A03) * AbstractC188878Yd.A01(context)) / 2.0f);
        constrainedEditText.setPadding(A01, constrainedEditText.getPaddingTop(), A01, constrainedEditText.getPaddingBottom());
        if (c6rb != null) {
            c6rb.A0E(A002);
            A09(constrainedEditText, c6rb, interactiveDrawableContainer, num, map);
        }
    }

    public static void A09(ConstrainedEditText constrainedEditText, C6RB c6rb, InteractiveDrawableContainer interactiveDrawableContainer, Integer num, Map map) {
        float f;
        float f2;
        A0B(c6rb, num);
        int activeDrawableId = interactiveDrawableContainer.getActiveDrawableId();
        if (activeDrawableId != -1) {
            C202278x7 A0L = interactiveDrawableContainer.A0L(activeDrawableId);
            PointF pointF = (PointF) map.get(c6rb);
            float f3 = 0.0f;
            if (pointF != null) {
                if (A0L == null) {
                    f = 0.0f;
                    f2 = 0.0f;
                } else {
                    f = A0L.A01;
                    f2 = A0L.A02;
                }
                if (pointF.x != f || pointF.y != f2) {
                    return;
                }
            }
            float A0H = AbstractC166997dE.A0H(c6rb);
            float A002 = AbstractC167007dF.A00(c6rb);
            int[] iArr = AbstractC22787A3f.A00;
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 2) {
                        f3 = (interactiveDrawableContainer.getRight() - constrainedEditText.getPaddingRight()) - (A0H / 2.0f);
                    }
                } else {
                    f3 = AbstractC166987dD.A07(interactiveDrawableContainer) / 2.0f;
                }
            } else {
                f3 = interactiveDrawableContainer.getLeft() + constrainedEditText.getPaddingLeft() + (A0H / 2.0f);
            }
            AHh.A02(InteractiveDrawableContainer.A02(interactiveDrawableContainer, activeDrawableId), f3, A002);
            C202278x7 A0L2 = interactiveDrawableContainer.A0L(activeDrawableId);
            if (A0L2 != null) {
                map.put(c6rb, new PointF(A0L2.A01, A0L2.A02));
            } else {
                AbstractC12120kG.A01("TextToolControllerUtil", AnonymousClass001.A0O("null InteractiveDrawableTransform, drawableId: ", activeDrawableId));
            }
        }
    }

    public static void A0B(C6RB c6rb, Integer num) {
        A0A(c6rb);
        c6rb.A0K(A00(c6rb, num));
        if (!TextUtils.isEmpty(c6rb.A0F)) {
            for (C202878y5 c202878y5 : (C202878y5[]) C4GL.A06(c6rb.A0F, C202878y5.class)) {
                c202878y5.A00 = num;
            }
        }
    }
}
