package X;

import android.content.res.Resources;
import com.instagram.user.model.User;

/* renamed from: X.8y3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202858y3 extends AbstractC202868y4 implements C6S2 {
    public final User A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C202858y3(Resources resources, User user) {
        super(resources);
        C14360o3.A0B(resources, 1);
        C14360o3.A0B(user, 2);
        this.A00 = user;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.WiW, X.XCW, java.lang.Object] */
    @Override // X.C6S2
    public final XCW Bz1() {
        int i = ((AbstractC202868y4) this).A01;
        User user = this.A00;
        ?? obj = new Object();
        obj.A00 = i;
        obj.A01 = user;
        return obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C202858y3(User user, int i) {
        super(i);
        C14360o3.A0B(user, 2);
        this.A00 = user;
    }
}
