package X;

import com.instagram.user.model.User;

/* renamed from: X.V3g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67941V3g extends C1P1 {
    public final /* synthetic */ C1P1 A00;
    public final /* synthetic */ User A01;

    public C67941V3g(C1P1 c1p1, User user) {
        this.A01 = user;
        this.A00 = c1p1;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1977570636);
        this.A00.onFail(C7J2.A00());
        C0f9.A0A(227074376, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        boolean z;
        C2JS requiredTreeField;
        C2JS requiredTreeField2;
        int A03 = C0f9.A03(1195015787);
        AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
        int A032 = C0f9.A03(-570412729);
        C14360o3.A0B(anonymousClass435, 0);
        C2JS c2js = (C2JS) anonymousClass435.A01;
        if (c2js != null && (requiredTreeField = c2js.getRequiredTreeField(0, "xdt_unmute_friend_map_user(data:$data)", C66998Uej.class, -747672209)) != null && (requiredTreeField2 = requiredTreeField.getRequiredTreeField(0, "friendship_status", C66997Uei.class, 370687074)) != null) {
            z = requiredTreeField2.hasFieldValue("is_muting_friend_map");
        } else {
            z = false;
        }
        this.A01.A12(z);
        C1P1 c1p1 = this.A00;
        if (z) {
            c1p1.onSuccess(C0eB.A00);
        } else {
            c1p1.onFail(C7J2.A00());
        }
        C0f9.A0A(-1438836536, A032);
        C0f9.A0A(-258920792, A03);
    }
}
