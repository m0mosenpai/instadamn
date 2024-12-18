package X;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;

/* renamed from: X.78Z, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C78Z implements C7QC {
    public final C162907Rb A00;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.message_expired_placeholder, viewGroup, false);
        C14360o3.A07(inflate);
        C43706JUr c43706JUr = new C43706JUr(inflate);
        C7N9.A01(inflate);
        this.A00.A00(c43706JUr);
        return c43706JUr;
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C14360o3.A0B(c7qd, 0);
        this.A00.A01(c7qd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
    
        if (r3.length() == 0) goto L9;
     */
    @Override // X.C7QC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void ADy(X.C7QD r9, X.InterfaceC129555tK r10) {
        /*
            r8 = this;
            X.JUr r9 = (X.C43706JUr) r9
            X.JVH r10 = (X.JVH) r10
            r5 = 0
            X.C14360o3.A0B(r9, r5)
            r0 = 1
            X.C14360o3.A0B(r10, r0)
            X.2iX r7 = r9.A03
            r0 = 8
            r7.setVisibility(r0)
            X.2iX r6 = r9.A02
            r6.setVisibility(r0)
            android.widget.LinearLayout r1 = r9.A01
            X.5tH r0 = r10.A00
            boolean r4 = r0.CVC()
            r0 = 8388611(0x800003, float:1.1754948E-38)
            if (r4 == 0) goto L28
            r0 = 8388613(0x800005, float:1.175495E-38)
        L28:
            r1.setGravity(r0)
            java.lang.CharSequence r3 = r10.A02
            if (r3 == 0) goto L36
            int r1 = r3.length()
            r0 = 0
            if (r1 != 0) goto L37
        L36:
            r0 = 1
        L37:
            r2 = 6
            if (r0 != 0) goto L4d
            android.view.View r1 = r7.getView()
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setText(r3)
            r1.setVisibility(r5)
            r0 = 5
            if (r4 == 0) goto L4a
            r0 = 6
        L4a:
            r1.setTextAlignment(r0)
        L4d:
            android.view.View r1 = r6.getView()
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.CharSequence r0 = r10.A01
            r1.setText(r0)
            r1.setVisibility(r5)
            int r0 = r10.A00
            r1.setTextColor(r0)
            if (r4 != 0) goto L63
            r2 = 5
        L63:
            r1.setTextAlignment(r2)
            X.7Rb r0 = r8.A00
            r0.A02(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78Z.ADy(X.7QD, X.5tK):void");
    }

    public C78Z(InterfaceC165247aD interfaceC165247aD, AnonymousClass988 anonymousClass988) {
        final InterfaceC164967Zl interfaceC164967Zl = (InterfaceC164967Zl) interfaceC165247aD;
        List singletonList = Collections.singletonList(new C1580177l(null, new C7Q6(interfaceC164967Zl) { // from class: X.78a
            public final InterfaceC164967Zl A00;

            {
                C14360o3.A0B(interfaceC164967Zl, 1);
                this.A00 = interfaceC164967Zl;
            }

            @Override // X.C7Q6
            public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
                JVH jvh = (JVH) obj;
                C14360o3.A0B(jvh, 0);
                Matcher A09 = AbstractC13670mt.A09(String.valueOf(jvh.A02));
                if (!A09.find()) {
                    A09 = AbstractC13670mt.A09(String.valueOf(jvh.A01));
                    if (!A09.find()) {
                        return false;
                    }
                }
                String group = A09.group(1);
                C14360o3.A07(group);
                String substring = group.substring(1);
                C14360o3.A07(substring);
                if (substring.length() != 0) {
                    ((InterfaceC165067Zv) this.A00).Cs3(substring, false, jvh.BSy().A01);
                    return true;
                }
                return false;
            }
        }, new C7Q7(interfaceC165247aD), new C7Q9((InterfaceC165307aJ) interfaceC165247aD, anonymousClass988.A1U), (InterfaceC165507ad) interfaceC165247aD, anonymousClass988, null, false));
        C14360o3.A07(singletonList);
        this.A00 = new C162907Rb(singletonList);
    }
}
