package X;

import android.content.Context;
import android.location.Location;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9hI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216029hI extends C2AG {
    public final Context A00;
    public final UserSession A01;
    public final AbstractC24481Hr A02;
    public final AbstractC24481Hr A03;
    public final InterfaceC25180BCd A04;
    public final C47Z A05;
    public final LinkedHashMap A06;

    @Override // X.C11R
    public final int getRunnableId() {
        return 325;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AbstractC24481Hr abstractC24481Hr = this.A02;
        if (abstractC24481Hr != null) {
            try {
                Location location = (Location) LH2.A01(abstractC24481Hr);
                if (location != null) {
                    C47Z c47z = this.A05;
                    c47z.A00 = location.getLatitude();
                    c47z.A01 = location.getLongitude();
                }
            } catch (InterruptedException unused) {
                AbstractC12120kG.A0G("VideoPrepareTask", "An interrupted occurred while waiting for async parsing of video location metadata to finish.", null);
            }
        }
        AbstractC24481Hr abstractC24481Hr2 = this.A03;
        if (abstractC24481Hr2 != null) {
            try {
                if (LH2.A02(abstractC24481Hr2, new LEZ(15L, TimeUnit.SECONDS))) {
                    C47Z c47z2 = this.A05;
                    Object A07 = abstractC24481Hr2.A07();
                    A07.getClass();
                    c47z2.A2k = ((File) A07).getAbsolutePath();
                    AbstractC167027dH.A0z(this.A01);
                } else {
                    AbstractC12120kG.A0G("VideoPrepareTask", "Timed out while waiting for async decor image saving to finish.", null);
                    AbstractC166987dD.A0t(this.A01).A0A("Timed out while waiting for async decor image saving to finish.");
                    return null;
                }
            } catch (InterruptedException e) {
                AbstractC12120kG.A0G("VideoPrepareTask", "An interrupted occurred while waiting for async decor image saving to finish.", e);
                AbstractC166987dD.A0t(this.A01).A0A("An interrupted occurred while waiting for async decor image saving to finish.");
                return null;
            }
        }
        LinkedHashMap linkedHashMap = this.A06;
        if (linkedHashMap != null) {
            AEF.A01(this.A01, this.A05, linkedHashMap);
        }
        this.A05.A5l = true;
        UserSession userSession = this.A01;
        C25A.A00(userSession).A0A();
        C25A.A00(userSession).A0B(this.A00.getApplicationContext());
        InterfaceC25180BCd interfaceC25180BCd = this.A04;
        if (interfaceC25180BCd != null) {
            interfaceC25180BCd.DxQ(new Object());
        }
        return new Object();
    }

    public C216029hI(Context context, UserSession userSession, AbstractC24481Hr abstractC24481Hr, AbstractC24481Hr abstractC24481Hr2, InterfaceC25180BCd interfaceC25180BCd, C47Z c47z, LinkedHashMap linkedHashMap) {
        this.A00 = context;
        this.A01 = userSession;
        this.A05 = c47z;
        this.A03 = abstractC24481Hr;
        this.A02 = abstractC24481Hr2;
        this.A06 = linkedHashMap;
        this.A04 = interfaceC25180BCd;
    }
}
