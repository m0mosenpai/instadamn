package X;

import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.AuthData;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.6CN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6CN {
    public InterfaceC136176Dz A00;
    public C1334860s A01;
    public AccountSession A02;
    public AuthData A03;
    public String A04;
    public final C61B A05;
    public final C6CO A06;
    public final Boolean A07;
    public final Boolean A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public C6CN(C61B c61b, InterfaceC136176Dz interfaceC136176Dz, C1334860s c1334860s, AccountSession accountSession, AuthData authData, Boolean bool, String str, boolean z, boolean z2, boolean z3) {
        String absolutePath;
        this.A02 = accountSession;
        this.A03 = authData;
        str = str == null ? AnonymousClass001.A0R("msys_database_", authData.getFacebookUserID()) : str;
        this.A04 = str;
        this.A01 = c1334860s;
        File databasePath = c1334860s.A01.getDatabasePath(str);
        File parentFile = databasePath.getParentFile();
        parentFile.getClass();
        parentFile.mkdirs();
        try {
            absolutePath = databasePath.getCanonicalPath();
        } catch (IOException unused) {
            absolutePath = databasePath.getAbsolutePath();
        }
        this.A09 = absolutePath;
        this.A00 = interfaceC136176Dz;
        this.A0C = z2;
        this.A0A = z;
        this.A08 = true;
        this.A0B = true;
        this.A0D = z3;
        this.A05 = c61b;
        this.A07 = bool;
        C6CO c6co = new C6CO();
        this.A06 = c6co;
        Map map = c6co.A00;
        map.put("COURIER_ENABLED", false);
        map.put("COURIER_CQL_ENABLED", false);
        map.put("RO_THREADS", 0);
        map.put("RW_THREADS", 0);
    }
}
