package X;

import android.text.TextWatcher;
import android.text.style.SuggestionSpan;
import com.instagram.common.session.UserSession;
import com.instagram.direct.share.ui.mediacomposer.core.MessagePartial;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7ON, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7ON implements TextWatcher {
    public int A00;
    public C7C8 A01;
    public boolean A02;
    public boolean A03;
    public MessagePartial[] A04;
    public final UserSession A05;
    public final List A06 = new ArrayList();
    public final InterfaceC09390do A07 = AbstractC09440dt.A01(new C206819Dm(this, 49));

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0118, code lost:
    
        if (r2 > 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x011a, code lost:
    
        r1 = r3[r4];
        r0 = r12.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011e, code lost:
    
        if (r0 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0120, code lost:
    
        r0.removeSpan(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0123, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0125, code lost:
    
        if (r4 >= r2) goto L88;
     */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void afterTextChanged(android.text.Editable r13) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7ON.afterTextChanged(android.text.Editable):void");
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C7C8 c7c8;
        C7C8 c7c82;
        Object[] objArr;
        SuggestionSpan[] suggestionSpanArr;
        Integer num;
        if (i == 0) {
            if (i2 == i3 && ((Boolean) this.A07.getValue()).booleanValue()) {
                List list = this.A06;
                list.clear();
                C7C8 c7c83 = this.A01;
                if (c7c83 == null || (objArr = c7c83.getSpans(0, i2, Object.class)) == null) {
                    objArr = new Object[0];
                }
                for (Object obj : objArr) {
                    if ((obj instanceof A7L) || (obj instanceof C22928A8y)) {
                        C7C8 c7c84 = this.A01;
                        Integer num2 = null;
                        if (c7c84 != null) {
                            num = Integer.valueOf(c7c84.getSpanStart(obj));
                        } else {
                            num = null;
                        }
                        C7C8 c7c85 = this.A01;
                        if (c7c85 != null) {
                            num2 = Integer.valueOf(c7c85.getSpanEnd(obj));
                        }
                        if (num != null && num2 != null) {
                            list.add(new C47630L1p(obj, num.intValue(), num2.intValue()));
                        }
                    }
                }
                C7C8 c7c86 = this.A01;
                int i4 = 0;
                if (c7c86 != null && (suggestionSpanArr = (SuggestionSpan[]) c7c86.getSpans(0, i2, SuggestionSpan.class)) != null) {
                    i4 = suggestionSpanArr.length;
                }
                this.A00 = i4;
            }
            if (this.A02 || (charSequence != null && charSequence.length() > 0 && (charSequence.charAt(i) == '@' || charSequence.charAt(i) == '/'))) {
                this.A02 = false;
                return;
            }
        }
        if (this.A04 != null) {
            this.A04 = null;
            return;
        }
        C7C8 c7c87 = this.A01;
        if (c7c87 != null) {
            int i5 = i + i2;
            Object[] spans = c7c87.getSpans(i, i5, C22928A8y.class);
            MessagePartial[] messagePartialArr = (MessagePartial[]) c7c87.getSpans(i, i5, MessagePartial.class);
            if (messagePartialArr != null && messagePartialArr.length != 0) {
                if (i2 > 0) {
                    this.A04 = messagePartialArr;
                    return;
                }
                if (spans != null) {
                    C0s6 c0s6 = new C0s6(spans);
                    while (c0s6.hasNext()) {
                        C22928A8y c22928A8y = (C22928A8y) c0s6.next();
                        if (i != c7c87.getSpanStart(c22928A8y) && i != c7c87.getSpanEnd(c22928A8y) && (c7c82 = this.A01) != null) {
                            Iterator it = c22928A8y.A03.iterator();
                            while (it.hasNext()) {
                                c7c82.removeSpan(it.next());
                            }
                            c7c82.removeSpan(c22928A8y);
                        }
                    }
                }
                C0s6 c0s62 = new C0s6(messagePartialArr);
                while (c0s62.hasNext()) {
                    Object next = c0s62.next();
                    if (i != c7c87.getSpanStart(next) && i != c7c87.getSpanEnd(next) && (c7c8 = this.A01) != null) {
                        c7c8.removeSpan(next);
                    }
                }
            }
        }
    }

    public C7ON(UserSession userSession) {
        this.A05 = userSession;
    }
}
