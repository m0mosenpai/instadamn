package X;

import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.ULy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66543ULy extends AbstractC68892Vdo {
    public static final List A07 = new ArrayList();
    public C69769Vv6 A00;
    public boolean A01;
    public final AbstractC68891Vdn A02;
    public final List A03;
    public final C70152W8s A04;
    public final String A05;
    public final C70682Wf3 A06;

    public void A06() {
        A05(this, "detach", new Object[0]);
        if (super.A00) {
            AbstractC68891Vdn abstractC68891Vdn = this.A02;
            abstractC68891Vdn.A01.clear();
            abstractC68891Vdn.A00 = false;
        }
        this.A00 = null;
        super.A00 = false;
    }

    public void A07() {
        A05(this, "refresh", new Object[0]);
    }

    public void A08() {
        A05(this, "suspend", new Object[0]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0066, code lost:
    
        if (r70.equals("SHARER_SELECTED") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x006f, code lost:
    
        if (r70.equals("CURRENT_TIME_UPDATED") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0078, code lost:
    
        if (r70.equals("POINTS_OF_INTEREST_SELECTED") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x008b, code lost:
    
        if (r70.equals("SHARERS_UPDATED") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x00b4, code lost:
    
        if (r70.equals("ERROR") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x00be, code lost:
    
        if (r70.equals("MAP_MOVED") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x00e9, code lost:
    
        if (r70.equals("MAP_CENTERED") == false) goto L6;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:105:0x00f8. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x002d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x051c A[LOOP:2: B:71:0x0516->B:73:0x051c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0597 A[LOOP:3: B:79:0x0591->B:81:0x0597, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x05ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A04(X.AbstractC66543ULy r68, java.lang.Object r69, java.lang.String r70) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC66543ULy.A04(X.ULy, java.lang.Object, java.lang.String):void");
    }

    public static void A05(AbstractC66543ULy abstractC66543ULy, String str, Object... objArr) {
        C70682Wf3 c70682Wf3 = abstractC66543ULy.A06;
        Thread currentThread = Thread.currentThread();
        Thread thread = Looper.getMainLooper().getThread();
        c70682Wf3.A00(AnonymousClass001.A0g(String.format(Locale.US, str, objArr), " thread=", currentThread.getName()));
        if (!abstractC66543ULy.A01 && currentThread.getId() != thread.getId()) {
            c70682Wf3.A00("Not running in main thread.");
            abstractC66543ULy.A01 = true;
        }
    }

    public AbstractC66543ULy(AbstractC68891Vdn abstractC68891Vdn, X92 x92, C70152W8s c70152W8s, C70682Wf3 c70682Wf3, String str) {
        super(x92);
        this.A03 = new ArrayList();
        this.A04 = c70152W8s;
        this.A02 = abstractC68891Vdn;
        this.A06 = c70682Wf3;
        this.A05 = TextUtils.isEmpty(str) ? "PresenterBase" : str;
        A05(this, "init", new Object[0]);
    }
}
