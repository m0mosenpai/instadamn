package X;

import com.instagram.pendingmedia.model.UserStoryTarget;

/* renamed from: X.GsM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38277GsM implements InterfaceC28041Xi {
    public static final C38277GsM A00 = new C38277GsM();

    @Override // X.InterfaceC28041Xi
    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        C122005fs c122005fs = (C122005fs) obj;
        C14360o3.A0A(c122005fs);
        UserStoryTarget A01 = c122005fs.A01();
        if (A01 != UserStoryTarget.A01 && A01 != UserStoryTarget.A02 && A01 != UserStoryTarget.A06 && A01 != UserStoryTarget.A07 && A01 != UserStoryTarget.A03 && A01 != UserStoryTarget.A09) {
            C14360o3.A0A(A01);
            if (!C14360o3.A0K(A01.CBn(), "ALL_WITH_BLACKLIST") && !C14360o3.A0K(A01.CBn(), "CLOSE_FRIENDS_WITH_BLACKLIST")) {
                return false;
            }
        }
        return true;
    }
}
