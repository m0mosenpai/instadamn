package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NeE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class EnumC53101NeE {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53101NeE[] A01;
    public static final EnumC53101NeE A02;
    public static final EnumC53101NeE A03;
    public static final EnumC53101NeE A04;
    public static final EnumC53101NeE A05;
    public static final EnumC53101NeE A06;
    public static final EnumC53101NeE A07;
    public static final EnumC53101NeE A08;

    static {
        N8O n8o = new N8O();
        A04 = n8o;
        N8P n8p = new N8P();
        A05 = n8p;
        N8N n8n = new N8N();
        A03 = n8n;
        EnumC53101NeE enumC53101NeE = new EnumC53101NeE() { // from class: X.N8R
        };
        A07 = enumC53101NeE;
        EnumC53101NeE enumC53101NeE2 = new EnumC53101NeE() { // from class: X.N8Q
        };
        A06 = enumC53101NeE2;
        N8M n8m = new N8M();
        A02 = n8m;
        N8S n8s = new N8S();
        A08 = n8s;
        EnumC53101NeE[] enumC53101NeEArr = {n8o, n8p, n8n, enumC53101NeE, enumC53101NeE2, n8m, n8s};
        A01 = enumC53101NeEArr;
        A00 = AbstractC12190kN.A00(enumC53101NeEArr);
    }

    public static EnumC53101NeE[] values() {
        return (EnumC53101NeE[]) A01.clone();
    }

    public final String A00(Context context, UserSession userSession) {
        if (this instanceof N8O) {
            return AbstractC166997dE.A0q(context.getResources(), 2131969682);
        }
        if (this instanceof N8S) {
            AbstractC167017dG.A1N(userSession, context);
            return A04.A00(context, userSession);
        }
        if (this instanceof N8N) {
            return AbstractC166997dE.A0q(context.getResources(), 2131969682);
        }
        if (this instanceof N8P) {
            return AbstractC166997dE.A0q(context.getResources(), 2131969683);
        }
        if (this instanceof N8M) {
            return null;
        }
        return AbstractC166997dE.A0q(context.getResources(), 2131969681);
    }

    public EnumC53101NeE(String str, int i) {
    }
}
