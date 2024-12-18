package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC12220kQ;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C18920wW;
import X.C19270xB;
import X.InterfaceC02590Ai;
import X.MSY;
import X.UKU;
import X.VHj;
import X.X7E;
import X.X7F;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class SandboxSelectorLogger {
    public final C18920wW logger;

    public final void enter(Sandbox sandbox) {
        C14360o3.A0B(sandbox, 0);
        X7F create = create(VHj.ENTERED);
        if (create != null) {
            UKU uku = (UKU) setSandbox(create, sandbox);
            uku.A0R("corpnet_status", "unknown");
            uku.Cht();
        }
    }

    public final void exit(Sandbox sandbox) {
        C14360o3.A0B(sandbox, 0);
        X7F create = create(VHj.EXITED);
        if (create != null) {
            UKU uku = (UKU) setSandbox(create, sandbox);
            uku.A0R("corpnet_status", "unknown");
            uku.Cht();
        }
    }

    public final void hostSelected(Sandbox sandbox) {
        C14360o3.A0B(sandbox, 0);
        X7F create = create(VHj.HOST_SELECTED);
        if (create != null) {
            UKU uku = (UKU) setSandbox(create, sandbox);
            uku.A0R("corpnet_status", "unknown");
            uku.Cht();
        }
    }

    public final void hostVerificationStart(Sandbox sandbox) {
        C14360o3.A0B(sandbox, 0);
        X7F create = create(VHj.HOST_VERIFICATION_STARTED);
        if (create != null) {
            UKU uku = (UKU) setSandbox(create, sandbox);
            uku.A0R("corpnet_status", "unknown");
            uku.Cht();
        }
    }

    public final void hostVerificationSuccess(Sandbox sandbox, boolean z) {
        C14360o3.A0B(sandbox, 0);
        X7F create = create(VHj.HOST_VERIFICATION_SUCESS);
        if (create != null) {
            setCorpnetStatus(setSandbox(create, sandbox), z).Cht();
        }
    }

    public final void listFetchStart(Sandbox sandbox) {
        C14360o3.A0B(sandbox, 0);
        X7F create = create(VHj.LIST_FETCH_STARTED);
        if (create != null) {
            UKU uku = (UKU) setSandbox(create, sandbox);
            uku.A0R("corpnet_status", "unknown");
            uku.Cht();
        }
    }

    public final void listFetchSuccess(Sandbox sandbox, boolean z) {
        C14360o3.A0B(sandbox, 0);
        X7F create = create(VHj.LIST_FETCHED_SUCESSS);
        if (create != null) {
            setCorpnetStatus(setSandbox(create, sandbox), z).Cht();
        }
    }

    /* loaded from: classes11.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SandboxType.values().length];
            try {
                MSY.A1I(SandboxType.PRODUCTION, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                MSY.A1J(SandboxType.DEDICATED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MSY.A1K(SandboxType.ON_DEMAND, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MSY.A1L(SandboxType.OTHER, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, X.0Aj, X.X7F] */
    private final X7F create(VHj vHj) {
        C18920wW c18920wW = this.logger;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_sandbox_selector");
        ?? obj = new Object();
        obj.A00 = A00;
        if (!A00.isSampled()) {
            return null;
        }
        obj.A0M(vHj, "action");
        return obj;
    }

    private final UKU setCorpnetStatus(X7E x7e, boolean z) {
        String str;
        if (z) {
            str = "on_corpnet";
        } else {
            str = "off_corpnet";
        }
        UKU uku = (UKU) x7e;
        uku.A0R("corpnet_status", str);
        return uku;
    }

    private final X7E setSandbox(X7F x7f, Sandbox sandbox) {
        String str;
        int ordinal = sandbox.type.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        str = "other";
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    str = "ondemand";
                }
            } else {
                str = "dedicated_devserver";
            }
        } else {
            str = "production";
        }
        UKU uku = (UKU) x7f;
        uku.A0R(DevServerEntity.COLUMN_HOST_TYPE, str);
        uku.A0R("hostname", sandbox.url);
        return uku;
    }

    public SandboxSelectorLogger(UserSession userSession, String str) {
        AbstractC167017dG.A1P(userSession, str);
        this.logger = AbstractC12220kQ.A01(new C19270xB(str), userSession);
    }

    public final void hostVerificationFailed(Sandbox sandbox, String str) {
        AbstractC167017dG.A1N(sandbox, str);
        X7F create = create(VHj.HOST_VERIFICATION_FAILED);
        if (create != null) {
            UKU uku = (UKU) setSandbox(create, sandbox);
            uku.A0R("corpnet_status", "unknown");
            uku.A0R("error_detail", str);
            uku.Cht();
        }
    }

    public final void listFetchFailed(Sandbox sandbox, String str) {
        AbstractC167017dG.A1N(sandbox, str);
        X7F create = create(VHj.LIST_FETCHED_FAILED);
        if (create != null) {
            UKU uku = (UKU) setSandbox(create, sandbox);
            uku.A0R("corpnet_status", "unknown");
            uku.A0R("error_detail", str);
            uku.Cht();
        }
    }
}
