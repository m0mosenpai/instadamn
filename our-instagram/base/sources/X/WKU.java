package X;

import android.text.NoCopySpan;
import android.text.TextWatcher;
import android.widget.TextView;

/* loaded from: classes11.dex */
public final class WKU implements NoCopySpan, TextWatcher {
    public final int A00;
    public final Object A01;

    public WKU(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x038d, code lost:
    
        if (r15.length() <= 0) goto L122;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v144, types: [X.VJH, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [X.0ps, java.lang.Object] */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void afterTextChanged(android.text.Editable r15) {
        /*
            Method dump skipped, instructions count: 1220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WKU.afterTextChanged(android.text.Editable):void");
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        TextView textView;
        if (13 - this.A00 == 0) {
            C14360o3.A0B(charSequence, 0);
            WFL wfl = (WFL) this.A01;
            if (AbstractC154816xW.A01(wfl.A0D) && i2 - i3 == 1) {
                String obj = charSequence.subSequence(i3 + i, i + i2).toString();
                C14360o3.A0B(obj, 0);
                if ("@".equals(obj)) {
                    textView = wfl.A08;
                } else if (!"#".equals(obj)) {
                    return;
                } else {
                    textView = wfl.A07;
                }
                if (textView != null) {
                    textView.setClickable(true);
                    textView.setSelected(false);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x02e7, code lost:
    
        if ((!r0.A04.isEmpty()) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02fb, code lost:
    
        if ((!r0.A03.isEmpty()) == false) goto L120;
     */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTextChanged(java.lang.CharSequence r32, int r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WKU.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
