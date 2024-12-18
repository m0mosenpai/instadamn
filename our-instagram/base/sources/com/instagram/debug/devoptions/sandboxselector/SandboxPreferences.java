package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC011604e;
import X.AbstractC11400iy;
import X.AbstractC167027dH;
import X.AbstractC31171DnF;
import X.C05F;
import X.C0JE;
import X.C0ST;
import X.C14360o3;
import X.C17280tP;
import X.C1HO;
import X.InterfaceC16820sZ;
import X.InterfaceC19390xP;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.L;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class SandboxPreferences {
    public final C17280tP devPrefs;
    public final SandboxUrlHelper urlHelper;
    public final UserSession userSession;

    private final InterfaceC19390xP observeDevPreference(InterfaceC16820sZ interfaceC16820sZ) {
        return C0ST.A01(AbstractC011604e.A00(C05F.A00, C0JE.A00(new SandboxPreferences$observeDevPreference$1(this, interfaceC16820sZ, null)), -1));
    }

    public final InterfaceC19390xP observeCurrentSandbox() {
        return C0ST.A01(AbstractC011604e.A00(C05F.A00, C0JE.A00(new SandboxPreferences$observeCurrentSandbox$$inlined$observeDevPreference$1(this, null, this)), -1));
    }

    public final InterfaceC19390xP observeSavedSandbox() {
        return C0ST.A01(AbstractC011604e.A00(C05F.A00, C0JE.A00(new SandboxPreferences$observeSavedSandbox$$inlined$observeDevPreference$1(this, null, this)), -1));
    }

    public final void setSandbox(String str) {
        C14360o3.A0B(str, 0);
        C17280tP c17280tP = this.devPrefs;
        boolean z = !str.equals("i.instagram.com");
        if (z) {
            String A05 = C1HO.A05(str);
            C14360o3.A07(A05);
            c17280tP.A0E(A05);
        }
        c17280tP.A0I(z);
        if (L.ig_android_other_category_sandbox_and_gql_endpoint_selectors_unified_experience_variants.is_enabled.getAndExpose(this.userSession).booleanValue()) {
            this.devPrefs.A0F(str);
            this.devPrefs.A0J(true);
            String A04 = C1HO.A04(str);
            C14360o3.A07(A04);
            AbstractC11400iy.A00().A01(A04);
        }
        C1HO.A07();
    }

    public final void updateServerHealthStatus(IgServerHealth igServerHealth) {
        C14360o3.A0B(igServerHealth, 0);
        C17280tP c17280tP = this.devPrefs;
        String str = igServerHealth.healthStatusString;
        C14360o3.A0B(str, 0);
        AbstractC31171DnF.A1S(c17280tP, str, c17280tP.A0r, C17280tP.A4G, 52);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getSavedSandbox() {
        String A05 = this.devPrefs.A05();
        if (A05.length() == 0) {
            return null;
        }
        return A05;
    }

    public final String getCurrentSandbox() {
        if (this.devPrefs.A0g()) {
            return this.devPrefs.A05();
        }
        return "i.instagram.com";
    }

    public final void resetToDefaultSandbox() {
        this.devPrefs.A0I(false);
        if (L.ig_android_other_category_sandbox_and_gql_endpoint_selectors_unified_experience_variants.is_enabled.getAndExpose(this.userSession).booleanValue()) {
            this.devPrefs.A0F("");
            this.devPrefs.A0J(false);
            AbstractC11400iy.A00().A01("");
        }
        C1HO.A07();
    }

    public SandboxPreferences(C17280tP c17280tP, SandboxUrlHelper sandboxUrlHelper, UserSession userSession) {
        AbstractC167027dH.A13(c17280tP, sandboxUrlHelper, userSession);
        this.devPrefs = c17280tP;
        this.urlHelper = sandboxUrlHelper;
        this.userSession = userSession;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.instagram.debug.devoptions.sandboxselector.SandboxUrlHelper] */
    public SandboxPreferences(UserSession userSession) {
        this(C17280tP.A4E.A00(), new Object(), userSession);
        C14360o3.A0B(userSession, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ SandboxPreferences(C17280tP c17280tP, SandboxUrlHelper sandboxUrlHelper, UserSession userSession, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C17280tP.A4E.A00() : c17280tP, (i & 2) != 0 ? new Object() : sandboxUrlHelper, userSession);
    }
}
