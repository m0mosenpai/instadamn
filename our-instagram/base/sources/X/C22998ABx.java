package X;

import com.instagram.api.schemas.ClipsTextAlignment;
import com.instagram.api.schemas.ClipsTextEmphasisMode;
import com.instagram.api.schemas.ClipsTextFormatType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ABx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C22998ABx {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public int A09;
    public int A0A;
    public ClipsTextAlignment A0B;
    public ClipsTextEmphasisMode A0C;
    public ClipsTextFormatType A0D;
    public String A0E;
    public String A0F;
    public List A0G;
    public final InterfaceC93104Fm A0H;

    public final C93094Fl A00() {
        ClipsTextAlignment clipsTextAlignment = this.A0B;
        List list = this.A0G;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(((InterfaceC93074Fh) it.next()).EsG());
        }
        float f = this.A00;
        float f2 = this.A02;
        float f3 = this.A03;
        String str = this.A0E;
        int i = this.A09;
        float f4 = this.A04;
        float f5 = this.A05;
        float f6 = this.A06;
        float f7 = this.A07;
        float f8 = this.A01;
        return new C93094Fl(clipsTextAlignment, this.A0C, this.A0D, str, this.A0F, A0q, f, f2, f3, f4, f5, f6, f7, f8, this.A08, i, this.A0A);
    }

    public C22998ABx(InterfaceC93104Fm interfaceC93104Fm) {
        this.A0H = interfaceC93104Fm;
        this.A0B = interfaceC93104Fm.Aar();
        this.A0G = interfaceC93104Fm.ApQ();
        this.A00 = interfaceC93104Fm.B27();
        this.A02 = interfaceC93104Fm.B7f();
        this.A03 = interfaceC93104Fm.BDQ();
        this.A0E = interfaceC93104Fm.getId();
        this.A09 = interfaceC93104Fm.isAnimated();
        this.A04 = interfaceC93104Fm.BYd();
        this.A05 = interfaceC93104Fm.BYf();
        this.A06 = interfaceC93104Fm.Bpb();
        this.A07 = interfaceC93104Fm.BqP();
        this.A01 = interfaceC93104Fm.Bzo();
        this.A0F = interfaceC93104Fm.getText();
        this.A0C = interfaceC93104Fm.C6D();
        this.A0D = interfaceC93104Fm.C6K();
        this.A08 = interfaceC93104Fm.CHe();
        this.A0A = interfaceC93104Fm.getZIndex();
    }
}
