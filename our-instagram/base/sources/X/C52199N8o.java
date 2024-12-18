package X;

import android.content.Context;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.N8o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52199N8o extends C2US implements CallerContextable {
    public static final String __redex_internal_original_name = "DirectPrivateStoryRecipientsAdapter";
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Integer A04;
    public boolean A06;
    public final int A07;
    public final int A08;
    public final Context A0A;
    public final UserSession A0B;
    public final N9A A0C;
    public final N9C A0D;
    public final ERB A0E;
    public final N99 A0F;
    public final InterfaceC58308Pt0 A0G;
    public final C52206N8v A0H;
    public final C32461ERn A0I;
    public final C32461ERn A0J;
    public final C52202N8r A0K;
    public final C54530O7h A0L;
    public final C41951wl A0M;
    public final C41891wf A0N;
    public final C195918ld A0O;
    public final C54486O5o A0P;
    public final C54486O5o A0Q;
    public final C54486O5o A0R;
    public final N91 A0S;
    public final String A0T;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final C65662y2 A0j;
    public final C32466ERs A0k;
    public final C32465ERr A0l;
    public final N9B A0m;
    public final C52204N8t A0n;
    public final DirectShareTarget A0o;
    public final ES2 A0p;
    public final C54486O5o A0q;
    public final KET A0r;
    public final JTJ A0s;
    public final ERQ A0t;
    public final Map A0u;
    public final boolean A0y;
    public final boolean A0z;
    public final LinkedHashSet A0X = AbstractC31171DnF.A0l();
    public final LinkedHashSet A0W = AbstractC31171DnF.A0l();
    public final LinkedHashSet A0Y = AbstractC31171DnF.A0l();
    public final LinkedHashSet A0V = AbstractC31171DnF.A0l();
    public final LinkedList A0Z = new LinkedList();
    public final LinkedHashSet A0U = AbstractC31171DnF.A0l();
    public final java.util.Set A0e = AbstractC31171DnF.A0l();
    public final java.util.Set A0x = AbstractC166987dD.A1H();
    public final java.util.Set A0v = AbstractC166987dD.A1H();
    public final java.util.Set A0w = AbstractC166987dD.A1H();
    public List A05 = AbstractC166987dD.A1E();
    public final Map A0c = AbstractC166987dD.A1G();
    public final Map A0b = AbstractC166987dD.A1G();
    public final Map A0a = AbstractC166987dD.A1G();
    public final java.util.Set A0d = AbstractC166987dD.A1H();
    public final int A09 = 20;

    private void A00(InterfaceC65642y0 interfaceC65642y0, Object obj) {
        AbstractC25227BEk.A1O(interfaceC65642y0, this.A0a, getCount());
        addModel(obj, null, interfaceC65642y0);
    }

    public static void A01(C52199N8o c52199N8o) {
        c52199N8o.A0w.clear();
        c52199N8o.A0x.clear();
        c52199N8o.A0v.clear();
    }

    private void A02(DirectShareTarget directShareTarget) {
        java.util.Set set;
        Comparable A00;
        List unmodifiableList = Collections.unmodifiableList(directShareTarget.A0Q);
        if (unmodifiableList.size() == 1) {
            if (directShareTarget.A01() instanceof MsysThreadId) {
                set = this.A0v;
            } else {
                set = this.A0x;
            }
            A00 = ((PendingRecipient) unmodifiableList.get(0)).getId();
        } else {
            set = this.A0w;
            A00 = directShareTarget.A00();
        }
        set.add(A00);
    }

    private boolean A03(DirectShareTarget directShareTarget) {
        java.util.Set set;
        Object A00;
        List unmodifiableList = Collections.unmodifiableList(directShareTarget.A0Q);
        if (unmodifiableList.size() == 1) {
            boolean z = directShareTarget.A01() instanceof MsysThreadId;
            set = this.A0x;
            A00 = ((PendingRecipient) unmodifiableList.get(0)).getId();
            if (z) {
                if (set.contains(A00) && this.A0v.contains(((PendingRecipient) unmodifiableList.get(0)).getId())) {
                    return true;
                }
                return false;
            }
        } else {
            set = this.A0w;
            A00 = directShareTarget.A00();
        }
        return set.contains(A00);
    }

    private boolean A04(DirectShareTarget directShareTarget) {
        if (this.A0z && this.A0N.A0A(directShareTarget, this.A0M)) {
            return true;
        }
        return false;
    }

    public final int A05(TextView textView) {
        java.util.Set set = this.A0d;
        if (!set.isEmpty()) {
            int size = set.size();
            C14360o3.A0B(textView, 0);
            return Math.max(OP7.A01(textView, new int[]{2131960436, 2131960440, 2131976066}, 0), OP7.A01(textView, new int[]{2131960436, 2131960440, 2131976066}, size));
        }
        C14360o3.A0B(textView, 0);
        return OP7.A00(textView, C05F.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x009d, code lost:
    
        if (r27.A0O.A06() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012f, code lost:
    
        if (r2.contains(com.instagram.pendingmedia.model.UserStoryTarget.A01) == false) goto L58;
     */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06() {
        /*
            Method dump skipped, instructions count: 1291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52199N8o.A06():void");
    }

    public final boolean A07(DirectShareTarget directShareTarget) {
        Map map;
        Object A00;
        List unmodifiableList = Collections.unmodifiableList(directShareTarget.A0Q);
        if (unmodifiableList.size() == 1) {
            map = this.A0c;
            A00 = ((PendingRecipient) AbstractC166987dD.A16(unmodifiableList)).getId();
        } else {
            map = this.A0b;
            A00 = directShareTarget.A00();
        }
        return map.containsKey(A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x029d, code lost:
    
        if (r34 != null) goto L12;
     */
    /* JADX WARN: Type inference failed for: r0v39, types: [X.2y2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, X.N8r] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, X.N8t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C52199N8o(android.content.Context r30, X.C684436h r31, X.InterfaceC11380iw r32, com.instagram.common.session.UserSession r33, com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim r34, X.C54404O2k r35, X.C54406O2m r36, X.PG1 r37, X.C54409O2p r38, X.C54410O2q r39, X.P27 r40, X.P28 r41, X.FFU r42, X.C54411O2r r43, com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r44, com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r45, X.InterfaceC58308Pt0 r46, X.InterfaceC58308Pt0 r47, X.InterfaceC58149PqE r48, X.InterfaceC58149PqE r49, X.C54530O7h r50, X.Ef3 r51, com.instagram.model.direct.DirectShareTarget r52, X.C211689Zc r53, X.C195918ld r54, X.MR8 r55, X.InterfaceC58010Pnu r56, java.util.Map r57, boolean r58, boolean r59, boolean r60, boolean r61, boolean r62, boolean r63, boolean r64) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52199N8o.<init>(android.content.Context, X.36h, X.0iw, com.instagram.common.session.UserSession, com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim, X.O2k, X.O2m, X.PG1, X.O2p, X.O2q, X.P27, X.P28, X.FFU, X.O2r, com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController, com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController, X.Pt0, X.Pt0, X.PqE, X.PqE, X.O7h, X.Ef3, com.instagram.model.direct.DirectShareTarget, X.9Zc, X.8ld, X.MR8, X.Pnu, java.util.Map, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
