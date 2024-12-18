package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.RDl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60614RDl extends SNK {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.fragment.app.Fragment, X.Q7p] */
    @Override // X.SNK
    public final Fragment A01(Bundle bundle, String str) {
        Fragment fragment;
        switch (str.hashCode()) {
            case -1551779224:
                if (str.equals("AUTH_THREE_DS_WEB_VIEW")) {
                    fragment = new C58761Q7q();
                    break;
                }
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("{FBPayAuthFragmentFactory} Fragment is not found for identifier => ");
                A1C.append(str);
                throw AbstractC37303Gc4.A0M(bundle, " with args => ", A1C);
            case -1328154499:
                if (str.equals("PIN_RESET_BY_CVV_PAYPAL")) {
                    fragment = new Fragment();
                    break;
                }
                StringBuilder A1C2 = AbstractC166987dD.A1C();
                A1C2.append("{FBPayAuthFragmentFactory} Fragment is not found for identifier => ");
                A1C2.append(str);
                throw AbstractC37303Gc4.A0M(bundle, " with args => ", A1C2);
            case -1209059961:
                if (str.equals("AUTH_WEB_VIEW")) {
                    fragment = new Fragment();
                    break;
                }
                StringBuilder A1C22 = AbstractC166987dD.A1C();
                A1C22.append("{FBPayAuthFragmentFactory} Fragment is not found for identifier => ");
                A1C22.append(str);
                throw AbstractC37303Gc4.A0M(bundle, " with args => ", A1C22);
            case -829105116:
                if (str.equals("PIN_BIO_SETTINGS")) {
                    fragment = new Fragment();
                    break;
                }
                StringBuilder A1C222 = AbstractC166987dD.A1C();
                A1C222.append("{FBPayAuthFragmentFactory} Fragment is not found for identifier => ");
                A1C222.append(str);
                throw AbstractC37303Gc4.A0M(bundle, " with args => ", A1C222);
            case -210415936:
                if (str.equals("AUTH_EDIT_TEXT_SCREEN")) {
                    fragment = new C58765Q7u();
                    break;
                }
                StringBuilder A1C2222 = AbstractC166987dD.A1C();
                A1C2222.append("{FBPayAuthFragmentFactory} Fragment is not found for identifier => ");
                A1C2222.append(str);
                throw AbstractC37303Gc4.A0M(bundle, " with args => ", A1C2222);
            case -17886736:
                if (str.equals("AUTH_USUP")) {
                    ?? fragment2 = new Fragment();
                    C58760Q7p.A00 = fragment2;
                    fragment2.setArguments(bundle);
                    return fragment2;
                }
                StringBuilder A1C22222 = AbstractC166987dD.A1C();
                A1C22222.append("{FBPayAuthFragmentFactory} Fragment is not found for identifier => ");
                A1C22222.append(str);
                throw AbstractC37303Gc4.A0M(bundle, " with args => ", A1C22222);
            case 642267786:
                if (str.equals("AUTH_CONTAINER")) {
                    fragment = new C0SG();
                    break;
                }
                StringBuilder A1C222222 = AbstractC166987dD.A1C();
                A1C222222.append("{FBPayAuthFragmentFactory} Fragment is not found for identifier => ");
                A1C222222.append(str);
                throw AbstractC37303Gc4.A0M(bundle, " with args => ", A1C222222);
            case 953556903:
                if (str.equals("AUTH_THREE_DS")) {
                    fragment = new Fragment();
                    break;
                }
                StringBuilder A1C2222222 = AbstractC166987dD.A1C();
                A1C2222222.append("{FBPayAuthFragmentFactory} Fragment is not found for identifier => ");
                A1C2222222.append(str);
                throw AbstractC37303Gc4.A0M(bundle, " with args => ", A1C2222222);
            default:
                StringBuilder A1C22222222 = AbstractC166987dD.A1C();
                A1C22222222.append("{FBPayAuthFragmentFactory} Fragment is not found for identifier => ");
                A1C22222222.append(str);
                throw AbstractC37303Gc4.A0M(bundle, " with args => ", A1C22222222);
        }
        fragment.setArguments(bundle);
        return fragment;
    }
}
