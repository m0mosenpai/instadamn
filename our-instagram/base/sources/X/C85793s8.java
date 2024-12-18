package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.3s8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85793s8 extends AbstractC85803s9 {
    public C19260xA A00;
    public final Context A01;
    public final FragmentActivity A02;
    public final UserSession A03;
    public final InterfaceC75453aC A04;
    public final String A05;
    public final C1M1 A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85793s8(Context context, FragmentActivity fragmentActivity, UserSession userSession, InterfaceC75453aC interfaceC75453aC, C1M1 c1m1, String str, boolean z, boolean z2) {
        super(context);
        C14360o3.A0B(context, 2);
        C14360o3.A0B(userSession, 3);
        C14360o3.A0B(interfaceC75453aC, 7);
        this.A02 = fragmentActivity;
        this.A01 = context;
        this.A03 = userSession;
        this.A06 = c1m1;
        this.A08 = z;
        this.A07 = z2;
        this.A04 = interfaceC75453aC;
        this.A05 = str;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.U9N, android.text.method.LinkMovementMethod] */
    public static final void A00(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C77043cq c77043cq, C85793s8 c85793s8, C81283jy c81283jy, C76853cX c76853cX, C75113Zb c75113Zb, int i) {
        C9BV c9bv;
        Context context;
        InterfaceC76583c3 interfaceC76583c3 = c76853cX.A0D;
        if (C9BV.A00(interfaceC76583c3, 0) && (c9bv = (C9BV) interfaceC76583c3) != null) {
            C25993Beh c25993Beh = (C25993Beh) c9bv.A02;
            if (c76853cX.A0Q) {
                C9C1 c9c1 = (C9C1) c9bv.A01;
                C107124sI c107124sI = (C107124sI) c77043cq.A04.getValue();
                CWU cwu = (CWU) c77043cq.A09.getValue();
                context = c85793s8.A01;
                AbstractC107134sJ.A00(cwu.A00(context, c25993Beh, interfaceC60442pS.getModuleName(), c75113Zb.A02), c9c1, userSession, c81283jy, c107124sI, c75113Zb, interfaceC60442pS.getModuleName(), i);
            } else {
                context = c85793s8.A01;
                C4e0.A00(context, userSession, interfaceC60442pS, c81283jy, c85793s8.A04, (C77963eO) c77043cq.A08.getValue(), (C77903eI) ((InterfaceC16600sD) c76853cX.A02.A0A).invoke(c75113Zb, c85793s8.A05, interfaceC60442pS, Integer.valueOf(i)), c75113Zb);
            }
            InterfaceC09390do interfaceC09390do = c77043cq.A09;
            SpannableStringBuilder A01 = ((CWU) interfaceC09390do.getValue()).A01(context, c25993Beh, i, c75113Zb.A02);
            TextView textView = c81283jy.A0F;
            int i2 = c25993Beh.A00;
            textView.setMaxLines(i2);
            boolean z = true;
            if (i2 != 1) {
                z = false;
            }
            textView.setSingleLine(z);
            CWU cwu2 = (CWU) interfaceC09390do.getValue();
            C14360o3.A0B(cwu2, 4);
            AbstractC77703du.A05(textView, EnumC77673dr.A0T);
            textView.setText(A01);
            U9N u9n = U9N.A00;
            U9N u9n2 = u9n;
            if (u9n == null) {
                ?? linkMovementMethod = new LinkMovementMethod();
                U9N.A00 = linkMovementMethod;
                u9n2 = linkMovementMethod;
            }
            textView.setMovementMethod(u9n2);
            C0fQ.A00(new ViewOnClickListenerC77633dn(userSession, null, new C9F4(41, c75113Zb, c25993Beh), new C9FT(i, 4, c25993Beh, c81283jy, cwu2), true), textView);
            textView.setOnTouchListener(new ViewOnTouchListenerC28683ClV(interfaceC60442pS, cwu2, c25993Beh));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0aea, code lost:
    
        if ((java.lang.System.currentTimeMillis() - X.AbstractC23021Ah.A00(r11).A01.getLong(X.AbstractC111324zv.A00(2076), 0)) <= java.util.concurrent.TimeUnit.DAYS.toMillis(1)) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0cd1, code lost:
    
        if ("feed_timeline".equals(r54.getModuleName()) != false) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0d75, code lost:
    
        if (r1 != false) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0dde, code lost:
    
        if ((!r16.isEmpty()) != true) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0777, code lost:
    
        if (r8 != null) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x08df, code lost:
    
        if (r7 != true) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0902, code lost:
    
        if (r1.CX2() != true) goto L194;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:125:0x09c7. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(final X.InterfaceC60442pS r54, final X.C77043cq r55, final X.C81283jy r56, X.InterfaceC76863cY r57, final X.C75113Zb r58, int r59) {
        /*
            Method dump skipped, instructions count: 3886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85793s8.A06(X.2pS, X.3cq, X.3jy, X.3cY, X.3Zb, int):void");
    }
}
