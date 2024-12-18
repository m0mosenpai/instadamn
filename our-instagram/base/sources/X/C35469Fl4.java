package X;

import android.text.NoCopySpan;
import android.text.TextWatcher;
import android.widget.TextView;

/* renamed from: X.Fl4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35469Fl4 implements NoCopySpan, TextWatcher {
    public final int A00;
    public final Object A01;

    public C35469Fl4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(TextView textView, Object obj, int i) {
        textView.addTextChangedListener(new C35469Fl4(obj, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x010f, code lost:
    
        r2.setVisibility(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0112, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x010d, code lost:
    
        r1 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01a7, code lost:
    
        if (X.AbstractC25225BEi.A1Y(r11) == true) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c2, code lost:
    
        if (r11.length() == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x010b, code lost:
    
        if (r0 != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (X.AbstractC25228BEl.A1A(r11.toString()).length() == 0) goto L73;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0180  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void afterTextChanged(android.text.Editable r11) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35469Fl4.afterTextChanged(android.text.Editable):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c7, code lost:
    
        if (r7.length() == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0130, code lost:
    
        if (r1 != true) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0167, code lost:
    
        if (r1 != false) goto L72;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTextChanged(java.lang.CharSequence r7, int r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35469Fl4.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
