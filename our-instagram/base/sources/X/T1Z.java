package X;

import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class T1Z implements InterfaceC65499TlN {
    public final Integer A00;
    public static final InterfaceC65499TlN A02 = new T1Z(C05F.A07);
    public static final InterfaceC65499TlN A01 = new T1Z(C05F.A01);
    public static final InterfaceC65499TlN A03 = new T1Z(C05F.A0j);

    @Override // X.InterfaceC65499TlN
    public final Bundle AQ4(Context context, Bundle bundle) {
        C4N8 A0V = AbstractC58319PtB.A0V(context, ((C74123Uq) C3UY.A00).A02(), C4N6.A00(this.A00));
        final Bundle A0b = AbstractC166987dD.A0b();
        Iterator A14 = AbstractC58319PtB.A14(bundle);
        while (A14.hasNext()) {
            String A1B = AbstractC166987dD.A1B(A14);
            try {
                EnumC74133Ur enumC74133Ur = (EnumC74133Ur) Enum.valueOf(EnumC74133Ur.class, A1B);
                final AbstractC74143Us abstractC74143Us = enumC74133Ur.A00;
                final String name = enumC74133Ur.name();
                try {
                    abstractC74143Us.A04(new InterfaceC65365Tix() { // from class: X.T13
                        @Override // X.InterfaceC65365Tix
                        public final void onResult(Object obj) {
                            abstractC74143Us.A02(A0b, obj, name);
                        }
                    }, A0V, null, enumC74133Ur.A01);
                } catch (ClassCastException e) {
                    C0K8.A0F("KeyValueWrapper", "preferencesToBundle got ClassCastException", e);
                }
            } catch (IllegalArgumentException e2) {
                C0K8.A0L("PreferencesBasedStateHelper", "aidlBundleKey: %s not exist in FbnsAIDLConstants", e2, A1B);
            }
        }
        return A0b;
    }

    @Override // X.InterfaceC65499TlN
    public final void AQA(Context context, Bundle bundle) {
        C91M ARA = AbstractC58319PtB.A0V(context, ((C74123Uq) C3UY.A00).A02(), C4N6.A00(this.A00)).ARA();
        Iterator A14 = AbstractC58319PtB.A14(bundle);
        while (A14.hasNext()) {
            String A1B = AbstractC166987dD.A1B(A14);
            try {
                EnumC74133Ur enumC74133Ur = (EnumC74133Ur) Enum.valueOf(EnumC74133Ur.class, A1B);
                enumC74133Ur.A00.A01(bundle, ARA, enumC74133Ur.name(), enumC74133Ur.A01);
            } catch (IllegalArgumentException e) {
                C0K8.A0L("PreferencesBasedStateHelper", "aidlBundleKey: %s not exist in FbnsAIDLConstants", e, A1B);
            }
        }
        ARA.AIb("PreferencesBasedStateHelper", "PreferencesManager failed to commit bundle values");
    }

    public T1Z(Integer num) {
        this.A00 = num;
    }
}
