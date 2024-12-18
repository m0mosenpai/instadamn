package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.Tar, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64966Tar extends C0YY implements InterfaceC16820sZ {
    public static final C64966Tar A00 = new C64966Tar();

    public C64966Tar() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        ImmutableMap.Builder A0Z = AbstractC58319PtB.A0Z();
        InterfaceC09390do interfaceC09390do = C63376Sin.A0C;
        A0Z.put("cc-number", AbstractC58321PtD.A15("cc[_\\-\\s]?number|credit[_\\-\\s]?card[_\\-\\s]?number|card[_\\-\\s]?Number|cc[_\\-\\s]?num|card[_\\-\\s]?No|number[_\\-\\s]?cc|card[_\\-\\s]?num|num[_\\-\\s]?card|number[_\\-\\s]?card|numer[_\\-\\s]?karty|n[uú]m[eé]ro.+tarjeta|n[uú]m[eé]ro.+carte|^[0123456789xX•]{4}[- ][0123456789xX•]{4}[- ][0123456789xX•]{4}[- ][0123456789xX•]{4}$", AbstractC58322PtE.A12(A0Z, "cc-csc", AbstractC58321PtD.A15("cvv|cc[\\-_\\s]?csc|credit[\\-_\\s]?card[\\-_\\s]?cvc|cvv[\\-_\\s]?num|payment\\[card[\\-_\\s]?code\\]|payment[\\-_\\s:]?ccv|cvc|payment\\.cvc|[sS]ecurity.*[cC]ode|[cC]v[vn]|CV[VN]", AbstractC58322PtE.A12(A0Z, "cc-exp", AbstractC58321PtD.A15("cc[\\-_\\s]?exp|expiryDate|expiry|[eE]xpir.*[dD]ate|[eE]xp.*[dD]ate|[cC]ard.*[eE]xpir|([cC]ard|[eE]xpir).*(.)\\2 *[/] *(.)\\3\\3?\\3?|expiration|mm\\s*[\\-_/]\\s*aa|mm\\s*[\\-_/]\\s*yy", AbstractC58322PtE.A12(A0Z, "cc-exp-month", AbstractC58321PtD.A15("cc[\\-_\\s]?exp[\\-_\\s]?month|exp[\\-_\\s]?month|credit[\\-_\\s]?card[\\-_\\s]?month|card[\\-_\\s]?exp[\\-_\\s]?month|[eE]xpir.*[mM]onth|[cC]redit.*[cC]ard.*[mM]onth", AbstractC58322PtE.A12(A0Z, "cc-exp-year", AbstractC58321PtD.A15("cc[\\-_\\s]?exp[\\-_\\s]?year|exp[\\-_\\s]?year|credit[\\-_\\s]?card[\\-_\\s]?year|card[\\-_\\s]?exp[\\-_\\s]?year|[eE]xpir.*[yY]ear|[cC]redit.*[cC]ard.*[yY]ear", AbstractC58322PtE.A12(A0Z, "cc-type", AbstractC58321PtD.A15("cc-type", AbstractC58322PtE.A12(A0Z, "cc-name", AbstractC58321PtD.A15("cc[\\-_\\s]?name|[nN]ame.*[oO]n.*[cC]ard|[cC]ard.*[nN]ame|[cC][cC].?[nN]ame|[cC]ard.*[oO]wner|[cC]ard.*[hH]older.*[nN]ame", AbstractC58322PtE.A12(A0Z, "cc-family-name", AbstractC58321PtD.A15("cc[\\-_\\s]?family[\\-_\\s]?name|[cC]ard.*[lL]ast.*[nN]ame|[cC]ard.*[fF]amily.*[nN]ame", AbstractC58322PtE.A12(A0Z, "cc-additional-name", AbstractC58321PtD.A15("cc[\\-_\\s]?additional[\\-_\\s]?name", (java.util.Set) interfaceC09390do.getValue()), interfaceC09390do)), interfaceC09390do)), interfaceC09390do)), interfaceC09390do)), interfaceC09390do)), interfaceC09390do)), interfaceC09390do)), interfaceC09390do)));
        return A0Z.buildOrThrow();
    }
}
