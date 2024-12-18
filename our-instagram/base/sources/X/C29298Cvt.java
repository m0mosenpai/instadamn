package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Cvt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29298Cvt implements InterfaceC85403rV {
    public final UserSession A00;
    public final Context A01;
    public final C85163r7 A02;
    public final boolean A03;

    public C29298Cvt(Context context, UserSession userSession, C85163r7 c85163r7, boolean z) {
        AbstractC167017dG.A1P(context, userSession);
        this.A01 = context;
        this.A00 = userSession;
        this.A03 = z;
        this.A02 = c85163r7;
    }

    @Override // X.InterfaceC85403rV
    public final void D4A(ClickableSpan clickableSpan, View view, UserSession userSession, String str) {
        String str2;
        AbstractC167017dG.A1N(userSession, str);
        if (this.A03) {
            C85163r7 c85163r7 = this.A02;
            JLO jlo = (JLO) c85163r7.A01.A0g.get(str);
            if (jlo != null) {
                String Bhi = jlo.Bhi();
                String BiG = jlo.BiG();
                Context context = this.A01;
                PackageManager packageManager = context.getPackageManager();
                String A00 = AbstractC111324zv.A00(2102);
                if (packageManager.getLaunchIntentForPackage(A00) == null && context.getPackageManager().getLaunchIntentForPackage("com.facebook.katana") == null) {
                    if (BiG != null) {
                        try {
                            FragmentActivity fragmentActivity = (FragmentActivity) AbstractC167197dY.A00(context, FragmentActivity.class);
                            if (fragmentActivity != null) {
                                if (C18U.A06(C06090Tz.A05, this.A00, 36325347331027981L)) {
                                    AbstractC34210F7i.A00(fragmentActivity, C05F.A01, Bhi, new C57262Pbk(context, this, BiG, 16));
                                }
                            }
                            C12260kU.A0G(context, AbstractC25227BEk.A0B(BiG));
                        } catch (NullPointerException | SecurityException unused) {
                        }
                    }
                } else if (Bhi != null) {
                    android.net.Uri A0B = AbstractC25227BEk.A0B(Bhi);
                    if (context.getPackageManager().getLaunchIntentForPackage(A00) == null) {
                        A00 = "com.facebook.katana";
                    }
                    Intent intent = new Intent("android.intent.action.VIEW").setData(A0B).setPackage(A00);
                    C14360o3.A07(intent);
                    C12260kU.A0B(context, intent);
                }
                AnonymousClass341 anonymousClass341 = c85163r7.A03;
                C14360o3.A06(anonymousClass341);
                if (AnonymousClass341.A0H != anonymousClass341 && AnonymousClass341.A0I != anonymousClass341 && AnonymousClass341.A0U != anonymousClass341) {
                    if (anonymousClass341 == AnonymousClass341.A08) {
                        str2 = AbstractC43591JPw.A00(35);
                    } else {
                        str2 = "";
                    }
                } else {
                    str2 = "post_view";
                }
                AnonymousClass426.A00.A06(userSession, str2);
            }
        }
    }
}
