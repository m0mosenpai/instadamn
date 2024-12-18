package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.Drx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31453Drx {
    public static final String A00(int i) {
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 6) {
                                    if (i != 7) {
                                        switch (i) {
                                            case 1000:
                                                return "all";
                                            case 1001:
                                                return "groups";
                                            case 1002:
                                                return "inbox_requests";
                                            default:
                                                throw AbstractC25230BEn.A0n("Unknown folder type ", i);
                                        }
                                    }
                                    return "custom";
                                }
                                return "ai_bot";
                            }
                            return "ad_response";
                        }
                        return "channels";
                    }
                    return "top_threads";
                }
                return "general";
            }
            return "primary";
        }
        return NetInfoModule.CONNECTION_TYPE_NONE;
    }
}
