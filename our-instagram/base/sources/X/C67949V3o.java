package X;

import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.HashMap;

/* renamed from: X.V3o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67949V3o extends C1P1 {
    public final /* synthetic */ C68096VAq A00;

    public C67949V3o(C68096VAq c68096VAq) {
        this.A00 = c68096VAq;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String str;
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -1672821940);
        Throwable A01 = abstractC115105If.A01();
        if (A01 != null) {
            C68096VAq c68096VAq = this.A00;
            C18920wW c18920wW = c68096VAq.A03;
            if (c18920wW == null) {
                C14360o3.A0F("logger");
                throw C00O.createAndThrow();
            }
            EnumC68189VFh enumC68189VFh = c68096VAq.A04;
            boolean z = c68096VAq.A06;
            HashMap hashMap = new HashMap();
            if (enumC68189VFh != null) {
                hashMap.put("preference", AbstractC167007dF.A0h(AbstractC166987dD.A19(enumC68189VFh)));
            }
            if (z) {
                str = "BPAT";
            } else {
                str = "FBAT";
            }
            hashMap.put("token_info", str);
            hashMap.put("has_permission", String.valueOf(z));
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "fulcrum_error_event");
            A00.AAP("event", "fulcrum_init_fetch_error");
            A00.A9M("selected_values", hashMap);
            A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "fulcrum_nexus");
            StackTraceElement[] stackTrace = A01.getStackTrace();
            C14360o3.A07(stackTrace);
            A00.A9M("server_exception", AbstractC167007dF.A0n("exception", AbstractC009903n.A07(", ", "[", "]", null, stackTrace)));
            A00.AAP("error_identifier", A01.getMessage());
            A00.Cht();
        }
        super.onFail(abstractC115105If);
        C0f9.A0A(-277708790, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-1069048807);
        C68096VAq c68096VAq = this.A00;
        c68096VAq.A07 = false;
        BaseFragmentActivity baseFragmentActivity = c68096VAq.A01;
        if (baseFragmentActivity == null) {
            C14360o3.A0F("activity");
            throw C00O.createAndThrow();
        }
        AbstractC31175DnJ.A0i(baseFragmentActivity);
        C0f9.A0A(1211970685, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        if (r2.A06("eligible_for_tokenless_promote") != false) goto L12;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67949V3o.onSuccess(java.lang.Object):void");
    }
}
