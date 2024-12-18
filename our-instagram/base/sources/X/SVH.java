package X;

import android.util.Base64;

/* loaded from: classes10.dex */
public final class SVH {
    public static final AbstractC63298Sgz A00;
    public static final AbstractC63298Sgz A01;
    public static final AbstractC63298Sgz A02;
    public static final AbstractC63298Sgz A03;
    public static final AbstractC63298Sgz A04;
    public static final AbstractC63298Sgz A05;
    public static final AbstractC63298Sgz A06;
    public static final AbstractC63298Sgz A07;
    public static final AbstractC63298Sgz A08;
    public static final AbstractC63298Sgz A09;
    public static final AbstractC63298Sgz A0A;
    public static final AbstractC63298Sgz A0B;
    public static final AbstractC63298Sgz A0C;

    static {
        android.net.Uri uri;
        synchronized (S7B.class) {
            C20030yX c20030yX = S7B.A00;
            uri = (android.net.Uri) c20030yX.get("com.google.android.gms.auth_account");
            if (uri == null) {
                uri = android.net.Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(android.net.Uri.encode("com.google.android.gms.auth_account"))));
                c20030yX.put("com.google.android.gms.auth_account", uri);
            }
        }
        if ("".isEmpty()) {
            SET set = new SET(uri);
            Double A0Y = MSY.A0Y();
            A00 = new AbstractC63298Sgz(set, A0Y, "getTokenRefactor__account_data_service_sample_percentage");
            Boolean A0b = AbstractC166997dE.A0b();
            A01 = new AbstractC63298Sgz(set, A0b, "getTokenRefactor__account_data_service_tokenAPI_usable");
            long j = 20L;
            A02 = new AbstractC63298Sgz(set, j, "getTokenRefactor__account_manager_timeout_seconds");
            A03 = new AbstractC63298Sgz(set, AbstractC167007dF.A0d(), "getTokenRefactor__android_id_shift");
            try {
                A04 = new RLF(set, C62843STq.A00, RLP.A01(Base64.decode("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", 3)));
                A05 = new AbstractC63298Sgz(set, A0b, "getTokenRefactor__chimera_get_token_evolved");
                A06 = new AbstractC63298Sgz(set, j, "getTokenRefactor__clear_token_timeout_seconds");
                A07 = new AbstractC63298Sgz(set, j, "getTokenRefactor__default_task_timeout_seconds");
                Boolean A0a = AbstractC166997dE.A0a();
                A08 = new AbstractC63298Sgz(set, A0a, "getTokenRefactor__gaul_accounts_api_evolved");
                A09 = new AbstractC63298Sgz(set, A0a, "getTokenRefactor__gaul_token_api_evolved");
                A0A = new AbstractC63298Sgz(set, 120L, "getTokenRefactor__get_token_timeout_seconds");
                A0B = new AbstractC63298Sgz(set, A0b, "getTokenRefactor__gms_account_authenticator_evolved");
                A0C = new AbstractC63298Sgz(set, A0Y, "getTokenRefactor__gms_account_authenticator_sample_percentage");
                return;
            } catch (Exception e) {
                throw AbstractC58318PtA.A0W(e);
            }
        }
        throw AbstractC166987dD.A14("Cannot set GServices prefix and skip GServices");
    }
}
