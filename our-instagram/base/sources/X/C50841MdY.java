package X;

import androidx.fragment.app.Fragment;
import com.instagram.newsfeed.fragment.NewsfeedFragment;

/* renamed from: X.MdY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50841MdY extends C06B {
    public final /* synthetic */ NewsfeedFragment A00;

    public C50841MdY(NewsfeedFragment newsfeedFragment) {
        this.A00 = newsfeedFragment;
    }

    @Override // X.C06B
    public final Fragment A01(ClassLoader classLoader, String str) {
        AbstractC167017dG.A1N(classLoader, str);
        if (C14360o3.A0K(C52775NXg.class.getName(), str) && this.A00.A05 != null) {
            return new C52775NXg();
        }
        Fragment A01 = super.A01(classLoader, str);
        C14360o3.A0A(A01);
        return A01;
    }
}
