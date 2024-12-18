package X;

import android.os.Handler;
import android.text.NoCopySpan;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.creation.publishscreen.fragment.feed.FollowersShareFragment;
import com.instagram.igds.components.form.IgFormField;

/* renamed from: X.Oi6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55346Oi6 implements NoCopySpan, TextWatcher {
    public final int A00;
    public final Object A01;

    public C55346Oi6(FollowersShareFragment followersShareFragment, int i) {
        this.A00 = i;
        switch (i) {
            case 9:
            case 10:
                this.A01 = followersShareFragment;
                return;
            default:
                this.A01 = new C13400mQ(new Handler(), new C56192Owz(followersShareFragment, 1), 1000L);
                return;
        }
    }

    public static EditText A00(IgFormField igFormField, Object obj, int i) {
        igFormField.A0H(new C55346Oi6(obj, i));
        return igFormField.getMEditText();
    }

    public static void A01(TextView textView, Object obj, int i) {
        textView.addTextChangedListener(new C55346Oi6(obj, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x009e, code lost:
    
        if (X.AbstractC001900j.A0T(r30) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a0, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a1, code lost:
    
        r9 = r8.A00;
        r11 = r8.A02;
        r10 = r8.A01;
        X.AbstractC167027dH.A12(r9, r12, r11);
        X.C14360o3.A0B(r10, 4);
        r3.Egh(new X.C51942MxP(r9, r10, r11, r12, !r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b8, code lost:
    
        if (r30 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00be, code lost:
    
        if (r30.length() != 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c0, code lost:
    
        r0 = X.C51048Mh0.A00(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c4, code lost:
    
        if (r0 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c6, code lost:
    
        r8 = r0.A01.A0b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ca, code lost:
    
        if (r8 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ce, code lost:
    
        if (r6.A00 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d2, code lost:
    
        if (r6.A01 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e3, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6.A0B.A00, 36323693768486387L) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e5, code lost:
    
        X.C57158PZc.A02(r8, r6, X.AbstractC141776au.A00(r6), 14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0097, code lost:
    
        if (r30 != null) goto L42;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:144:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03ec  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void afterTextChanged(android.text.Editable r30) {
        /*
            Method dump skipped, instructions count: 1368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55346Oi6.afterTextChanged(android.text.Editable):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTextChanged(java.lang.CharSequence r7, int r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55346Oi6.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C55346Oi6(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
