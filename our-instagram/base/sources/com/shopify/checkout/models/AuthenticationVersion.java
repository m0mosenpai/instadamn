package com.shopify.checkout.models;

import X.AbstractC09440dt;
import X.AbstractC12190kN;
import X.C3R9;
import X.C71789X4q;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import kotlin.Deprecated;
import kotlin.enums.EnumEntries;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable(with = AuthenticationVersionSerializer.class)
/* loaded from: classes11.dex */
public final class AuthenticationVersion {
    public static final InterfaceC09390do A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AuthenticationVersion[] A03;

    @Deprecated(message = "Use V2 to authenticate against Checkout Sheet Protocol ")
    public static final AuthenticationVersion A04;
    public static final AuthenticationVersion A05;
    public static final Companion Companion;
    public final String A00;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return (C3R9) AuthenticationVersion.A01.getValue();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.shopify.checkout.models.AuthenticationVersion$Companion] */
    static {
        AuthenticationVersion authenticationVersion = new AuthenticationVersion("V1", 0, "v1");
        A04 = authenticationVersion;
        AuthenticationVersion authenticationVersion2 = new AuthenticationVersion("V2", 1, "v2");
        A05 = authenticationVersion2;
        AuthenticationVersion[] authenticationVersionArr = {authenticationVersion, authenticationVersion2};
        A03 = authenticationVersionArr;
        A02 = AbstractC12190kN.A00(authenticationVersionArr);
        Companion = new Object();
        A01 = AbstractC09440dt.A00(EnumC09460dv.A03, C71789X4q.A00);
    }

    public static AuthenticationVersion valueOf(String str) {
        return (AuthenticationVersion) Enum.valueOf(AuthenticationVersion.class, str);
    }

    public static AuthenticationVersion[] values() {
        return (AuthenticationVersion[]) A03.clone();
    }

    public AuthenticationVersion(String str, int i, String str2) {
        this.A00 = str2;
    }
}
