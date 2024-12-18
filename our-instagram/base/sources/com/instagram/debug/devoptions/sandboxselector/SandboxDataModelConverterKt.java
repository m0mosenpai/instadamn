package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC001800i;
import X.AbstractC001900j;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AnonymousClass001;
import X.C01L;
import X.C0eM;
import X.C14360o3;
import X.C2BS;
import X.C69749Vuj;
import com.instagram.debug.devoptions.sandboxselector.DevserverListError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class SandboxDataModelConverterKt {
    public static final String PRODUCTION_DESCRIPTION = "Routes to prod - will pick a random routing pool";
    public static final String PROD_DOMAIN = "prod.instagram.com";
    public static final String SANDBOX_SUBDOMAIN_DEDICATED = ".devvm";
    public static final String SANDBOX_SUBDOMAIN_ON_DEMAND = ".od";

    public static final Sandbox hostNameToSandbox(String str, String str2) {
        AbstractC167007dF.A1K(str, str2);
        return new Sandbox(str, hostNameToSandboxType(str, str2), "", false);
    }

    public static final SandboxErrorInfo toSandboxError(DevserverListError.HttpError httpError) {
        C14360o3.A0B(httpError, 0);
        int i = httpError.statusCode;
        if (i == 404) {
            return new SandboxErrorInfo(new C69749Vuj(new Object[0], 2131958352), new C69749Vuj(new Object[0], 2131958351), "User is not an employee");
        }
        return new SandboxErrorInfo(new C69749Vuj(new Object[0], 2131958348), new C69749Vuj(new Object[]{Integer.valueOf(i), String.valueOf(httpError.errorMessage)}, 2131958347), AnonymousClass001.A05(httpError.statusCode, "HTTP error ", " : ", httpError.errorMessage));
    }

    public static final List toSandboxes(List list, String str, String str2) {
        AbstractC167007dF.A1D(list, 0, str2);
        C01L A1I = C0eM.A1I();
        A1I.add(new Sandbox(str2, SandboxType.PRODUCTION, PRODUCTION_DESCRIPTION, true));
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DevServerEntity devServerEntity = (DevServerEntity) it.next();
            A0q.add(new Sandbox(devServerEntity.url, getSandboxType(devServerEntity), devServerEntity.description, devServerEntity.supportsVpnless));
        }
        A1I.addAll(AbstractC001800i.A0g(A0q, new Comparator() { // from class: com.instagram.debug.devoptions.sandboxselector.SandboxDataModelConverterKt$toSandboxes$lambda$3$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C2BS.A00(Integer.valueOf(((Sandbox) obj).type.ordinal()), Integer.valueOf(((Sandbox) obj2).type.ordinal()));
            }
        }));
        if (str != null) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (C14360o3.A0K(((DevServerEntity) it2.next()).url, str)) {
                        break;
                    }
                }
            }
            A1I.add(new Sandbox(str, SandboxType.OTHER, "", false));
        }
        return C0eM.A1J(A1I);
    }

    public static final SandboxType getSandboxType(DevServerEntity devServerEntity) {
        String str = devServerEntity.hostType;
        int hashCode = str.hashCode();
        if (hashCode != -1675226388) {
            if (hashCode != 916067498) {
                if (hashCode == 1726636778 && str.equals("On Demand Instances")) {
                    return SandboxType.ON_DEMAND;
                }
            } else if (str.equals("Production Tiers")) {
                return SandboxType.PRODUCTION;
            }
        } else if (str.equals("Dedicated Devservers")) {
            return SandboxType.DEDICATED;
        }
        return SandboxType.OTHER;
    }

    public static /* synthetic */ Sandbox hostNameToSandbox$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "i.instagram.com";
        }
        return hostNameToSandbox(str, str2);
    }

    public static /* synthetic */ SandboxType hostNameToSandboxType$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "i.instagram.com";
        }
        return hostNameToSandboxType(str, str2);
    }

    public static /* synthetic */ List toSandboxes$default(List list, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "i.instagram.com";
        }
        return toSandboxes(list, str, str2);
    }

    public static final SandboxType hostNameToSandboxType(String str, String str2) {
        if (!C14360o3.A0K(str, str2) && !AbstractC001900j.A0a(str, PROD_DOMAIN, false)) {
            if (AbstractC001900j.A0a(str, SANDBOX_SUBDOMAIN_ON_DEMAND, false)) {
                return SandboxType.ON_DEMAND;
            }
            if (AbstractC001900j.A0a(str, SANDBOX_SUBDOMAIN_DEDICATED, false)) {
                return SandboxType.DEDICATED;
            }
            return SandboxType.OTHER;
        }
        return SandboxType.PRODUCTION;
    }

    public static final SandboxErrorInfo toSandboxError(DevserverListError devserverListError) {
        C14360o3.A0B(devserverListError, 0);
        if (devserverListError instanceof DevserverListError.ConnectionError) {
            return new SandboxErrorInfo(new C69749Vuj(new Object[0], 2131958350), new C69749Vuj(new Object[0], 2131958349), "Connection error");
        }
        if (devserverListError instanceof DevserverListError.HttpError) {
            return toSandboxError((DevserverListError.HttpError) devserverListError);
        }
        throw new RuntimeException();
    }
}
