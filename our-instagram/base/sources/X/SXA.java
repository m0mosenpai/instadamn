package X;

import android.content.Context;
import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes10.dex */
public final class SXA {
    public String A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final String A06;
    public final boolean A07;

    public SXA(Boolean bool, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A06 = str;
        this.A07 = z;
        this.A02 = z2;
        this.A04 = z3;
        this.A05 = z4;
        this.A00 = str2;
        this.A03 = z5;
        if (bool != null) {
            this.A01 = bool.booleanValue();
        }
    }

    public static SXA A00(Context context) {
        boolean z;
        Boolean bool = null;
        Cursor A01 = C0fI.A01(context.getContentResolver(), AbstractC58321PtD.A0L(context.getPackageName()), null, null, null, null, -1630508427);
        if (A01 != null) {
            try {
                if (A01.moveToFirst()) {
                    int columnIndex = A01.getColumnIndex("package_name");
                    int columnIndex2 = A01.getColumnIndex(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE);
                    int columnIndex3 = A01.getColumnIndex("is_managed");
                    int columnIndex4 = A01.getColumnIndex("auto_updates");
                    int columnIndex5 = A01.getColumnIndex("notif_update_available");
                    int columnIndex6 = A01.getColumnIndex("notif_update_installed");
                    int columnIndex7 = A01.getColumnIndex("rollout_token");
                    int columnIndex8 = A01.getColumnIndex("terms_of_service_accepted");
                    int columnIndex9 = A01.getColumnIndex("show_accept_tos");
                    int columnIndex10 = A01.getColumnIndex("show_show_explicit_tos");
                    int columnIndex11 = A01.getColumnIndex("is_restricted_mode");
                    int columnIndex12 = A01.getColumnIndex("wa_updates_enabled");
                    int columnIndex13 = A01.getColumnIndex("updates_over_cellular_enabled");
                    int columnIndex14 = A01.getColumnIndex("wa_cross_install_enabled");
                    String string = A01.getString(columnIndex);
                    A01.getString(columnIndex2);
                    boolean A1M = AbstractC167007dF.A1M(A01.getInt(columnIndex3));
                    boolean A1M2 = AbstractC167007dF.A1M(A01.getInt(columnIndex4));
                    boolean A1M3 = AbstractC167007dF.A1M(A01.getInt(columnIndex5));
                    boolean A1M4 = AbstractC167007dF.A1M(A01.getInt(columnIndex6));
                    String string2 = A01.getString(columnIndex7);
                    if (columnIndex8 >= 0) {
                        z = AbstractC167007dF.A1M(A01.getInt(columnIndex8));
                    } else {
                        z = false;
                    }
                    if (columnIndex9 >= 0) {
                        A01.getInt(columnIndex9);
                        A01.getInt(columnIndex10);
                    }
                    if (columnIndex11 >= 0) {
                        A01.getInt(columnIndex11);
                    }
                    if (columnIndex12 >= 0) {
                        A01.getInt(columnIndex12);
                    }
                    if (columnIndex13 >= 0) {
                        bool = Boolean.valueOf(AbstractC167007dF.A1M(A01.getInt(columnIndex13)));
                    }
                    if (columnIndex14 >= 0) {
                        A01.getInt(columnIndex14);
                    }
                    return new SXA(bool, string, string2, A1M, A1M2, A1M3, A1M4, z);
                }
                throw AbstractC166987dD.A14("Failed to fetch settings: empty cursor");
            } finally {
                A01.close();
            }
        }
        throw AbstractC166987dD.A14("Failed to fetch settings: null cursor.");
    }
}
