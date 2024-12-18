package androidx.compose.ui.text.input;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;

/* loaded from: classes5.dex */
public final class ImeAction {
    public final int A00;

    public static String A00(int i) {
        if (i == -1) {
            return "Unspecified";
        }
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return ServerW3CShippingAddressConstants.DEFAULT;
        }
        if (i == 2) {
            return "Go";
        }
        if (i == 3) {
            return "Search";
        }
        if (i == 4) {
            return "Send";
        }
        if (i == 5) {
            return "Previous";
        }
        if (i == 6) {
            return "Next";
        }
        if (i == 7) {
            return "Done";
        }
        return "Invalid";
    }

    public final int hashCode() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof ImeAction) || i != ((ImeAction) obj).A00) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return A00(this.A00);
    }
}
