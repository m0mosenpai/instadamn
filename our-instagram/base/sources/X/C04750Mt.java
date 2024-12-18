package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.0Mt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04750Mt extends C08150bd {
    public boolean A02 = false;
    public boolean A03 = false;
    public String A01 = null;
    public C03190Dc A00 = null;

    @Override // X.C08150bd
    public final /* bridge */ /* synthetic */ C08150bd A05(Intent intent, ClassLoader classLoader) {
        super.A05(intent, null);
        return this;
    }

    public final void A0A(Intent intent) {
        A05(intent, null);
    }

    public final void A08() {
        super.A01 |= 8;
    }

    public final void A09() {
        super.A01 |= 1;
    }

    @Override // X.C08150bd
    public final Intent A04(Context context) {
        AbstractC08800ci abstractC08800ci;
        String str;
        Bundle extras;
        Intent A04 = super.A04(context);
        if (this.A02) {
            boolean z = false;
            if ((!this.A03 || (extras = A04.getExtras()) == null || extras.getParcelable("_ci_") == null) && (((abstractC08800ci = this.A09) == null || abstractC08800ci.A01(this.A06)) && (4 & super.A01) == 0 && (str = A04.getPackage()) != null)) {
                if (str.equals(context.getPackageName())) {
                    z = true;
                } else if (this.A00 != null) {
                    try {
                        z = this.A00.A03(C0LG.A03(AbstractC08450c9.A00(context, str), false), AbstractC08450c9.A02(context));
                    } catch (Exception e) {
                        InterfaceC08100bW interfaceC08100bW = this.A08;
                        if (interfaceC08100bW != null) {
                            interfaceC08100bW.EH9(AnonymousClass001.A0u("Exception checking identity of package=", str, ": ", e.toString()));
                        }
                    }
                }
            }
            if (z) {
                InterfaceC08100bW interfaceC08100bW2 = this.A08;
                String str2 = this.A01;
                if (interfaceC08100bW2 != null) {
                    AbstractC08500cE.A01(context, A04, interfaceC08100bW2, str2);
                } else {
                    try {
                        AbstractC08500cE.A02(context, A04, str2);
                        return A04;
                    } catch (C08660cU unused) {
                    }
                }
            }
        }
        return A04;
    }

    @Override // X.C08150bd
    public final /* bridge */ /* synthetic */ C08150bd A07(AbstractC08800ci abstractC08800ci) {
        super.A07(abstractC08800ci);
        return this;
    }

    @Override // X.C08150bd
    public final /* bridge */ /* synthetic */ C08150bd A06(Bundle bundle, ClassLoader classLoader) {
        super.A06(bundle, classLoader);
        return this;
    }

    public final void A0B(Intent intent, ClassLoader classLoader) {
        super.A05(intent, classLoader);
    }
}
