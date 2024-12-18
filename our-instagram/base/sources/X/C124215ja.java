package X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5ja, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124215ja implements InterfaceC124225jb {
    public final C111074zO A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final HashMap A04;
    public final List A05;
    public final List A06;
    public final List A07;

    public C124215ja(C111074zO c111074zO, Boolean bool, String str, String str2, HashMap hashMap, List list, List list2, List list3) {
        C14360o3.A0B(list2, 4);
        this.A07 = list;
        this.A02 = str;
        this.A05 = list2;
        this.A06 = list3;
        this.A04 = hashMap;
        this.A00 = c111074zO;
        this.A03 = str2;
        this.A01 = bool;
    }

    @Override // X.InterfaceC124225jb
    public final List AoL() {
        return this.A07;
    }

    @Override // X.InterfaceC124225jb
    public final String Aqj() {
        return this.A02;
    }

    @Override // X.InterfaceC124225jb
    public final List BKG() {
        return this.A06;
    }

    @Override // X.InterfaceC124225jb
    public final /* bridge */ /* synthetic */ Map BR0() {
        return this.A04;
    }

    @Override // X.InterfaceC124225jb
    public final InterfaceC111084zP Bb9() {
        return this.A00;
    }

    @Override // X.InterfaceC124225jb
    public final String Bm2() {
        return this.A03;
    }

    @Override // X.InterfaceC124225jb
    public final Boolean CCI() {
        return this.A01;
    }

    @Override // X.InterfaceC124225jb
    public final List getItems() {
        return this.A05;
    }
}
