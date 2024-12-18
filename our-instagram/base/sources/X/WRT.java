package X;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import com.google.common.collect.ImmutableList;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes11.dex */
public final class WRT implements XE1 {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC72026XFo A04;
    public C70327WRh A05;
    public MotionPhotoMetadata A06;
    public C70326WRg A07;
    public XGj A08;
    public final WFa A09 = new WFa(6);
    public long A03 = -1;

    @Override // X.XE1
    public final /* synthetic */ XE1 CCR() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.XE1
    public final int E7l(XGj xGj, VZk vZk) {
        int i;
        String A0F;
        String str;
        String str2;
        long j;
        long j2;
        long j3;
        int i2 = this.A02;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 == 6) {
                                return -1;
                            }
                            throw new IllegalStateException();
                        }
                        if (this.A05 == null || xGj != this.A08) {
                            this.A08 = xGj;
                            this.A05 = new C70327WRh(xGj, this.A03);
                        }
                        C70326WRg c70326WRg = this.A07;
                        c70326WRg.getClass();
                        int E7l = c70326WRg.E7l(this.A05, vZk);
                        if (E7l != 1) {
                            return E7l;
                        }
                        vZk.A00 += this.A03;
                        return E7l;
                    }
                    long BeZ = xGj.BeZ();
                    long j4 = this.A03;
                    if (BeZ != j4) {
                        vZk.A00 = j4;
                        return 1;
                    }
                    if (xGj.E3t(this.A09.A02, 0, 1, true)) {
                        xGj.EJn();
                        if (this.A07 == null) {
                            this.A07 = new C70326WRg(InterfaceC72027XFp.A00, 8);
                        }
                        C70327WRh c70327WRh = new C70327WRh(xGj, this.A03);
                        this.A05 = c70327WRh;
                        if (this.A07.EmK(c70327WRh)) {
                            C70326WRg c70326WRg2 = this.A07;
                            long j5 = this.A03;
                            InterfaceC72026XFo interfaceC72026XFo = this.A04;
                            interfaceC72026XFo.getClass();
                            c70326WRg2.CNe(new C70332WRm(interfaceC72026XFo, j5));
                            MotionPhotoMetadata motionPhotoMetadata = this.A06;
                            motionPhotoMetadata.getClass();
                            InterfaceC72026XFo interfaceC72026XFo2 = this.A04;
                            interfaceC72026XFo2.getClass();
                            XG2 F87 = interfaceC72026XFo2.F87(1024, 4);
                            C70116W4o c70116W4o = new C70116W4o();
                            c70116W4o.A0S = WEI.A02("image/jpeg");
                            c70116W4o.A0P = new Metadata(motionPhotoMetadata);
                            XG2.A00(c70116W4o, F87);
                            i = 5;
                        }
                    }
                    InterfaceC72026XFo interfaceC72026XFo3 = this.A04;
                    interfaceC72026XFo3.getClass();
                    interfaceC72026XFo3.ASd();
                    C70345WRz.A00(this.A04, -9223372036854775807L);
                    i = 6;
                } else {
                    if (this.A00 == 65505) {
                        int i3 = this.A01;
                        WFa wFa = new WFa(i3);
                        xGj.readFully(wFa.A02, 0, i3);
                        if (this.A06 == null && "http://ns.adobe.com/xap/1.0/".equals(wFa.A0F()) && (A0F = wFa.A0F()) != null) {
                            long length = xGj.getLength();
                            MotionPhotoMetadata motionPhotoMetadata2 = null;
                            if (length != -1) {
                                try {
                                    XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                                    newPullParser.setInput(new StringReader(A0F));
                                    newPullParser.next();
                                    if (W6M.A02("x:xmpmeta", newPullParser)) {
                                        long j6 = -9223372036854775807L;
                                        ImmutableList of = ImmutableList.of();
                                        loop0: while (true) {
                                            newPullParser.next();
                                            if (W6M.A02(AbstractC58317Pt9.A00(935), newPullParser)) {
                                                String[] strArr = VZO.A02;
                                                int i4 = 0;
                                                while (true) {
                                                    String A00 = W6M.A00(strArr[i4], newPullParser);
                                                    if (A00 != null) {
                                                        if (Integer.parseInt(A00) != 1) {
                                                            break;
                                                        }
                                                        String[] strArr2 = VZO.A01;
                                                        int i5 = 0;
                                                        while (true) {
                                                            j6 = -9223372036854775807L;
                                                            if (i5 >= 4) {
                                                                break;
                                                            }
                                                            String A002 = W6M.A00(strArr2[i5], newPullParser);
                                                            if (A002 != null) {
                                                                long parseLong = Long.parseLong(A002);
                                                                if (parseLong != -1) {
                                                                    j6 = parseLong;
                                                                }
                                                            } else {
                                                                i5++;
                                                            }
                                                        }
                                                        String[] strArr3 = VZO.A00;
                                                        int i6 = 0;
                                                        while (true) {
                                                            String A003 = W6M.A00(strArr3[i6], newPullParser);
                                                            if (A003 != null) {
                                                                of = ImmutableList.of((Object) new C69035Vgc(0L, "image/jpeg", 0L), (Object) new C69035Vgc(Long.parseLong(A003), "video/mp4", 0L));
                                                                break;
                                                            }
                                                            i6++;
                                                            if (i6 >= 2) {
                                                                of = ImmutableList.of();
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        i4++;
                                                        if (i4 >= 4) {
                                                            break loop0;
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (W6M.A02("Container:Directory", newPullParser)) {
                                                    str = "Container";
                                                    str2 = "Item";
                                                } else if (W6M.A02("GContainer:Directory", newPullParser)) {
                                                    str = "GContainer";
                                                    str2 = "GContainerItem";
                                                }
                                                ImmutableList.Builder builder = ImmutableList.builder();
                                                String A0R = AnonymousClass001.A0R(str, ":Item");
                                                String A0R2 = AnonymousClass001.A0R(str, ":Directory");
                                                do {
                                                    newPullParser.next();
                                                    if (W6M.A02(A0R, newPullParser)) {
                                                        String A0R3 = AnonymousClass001.A0R(str2, ":Mime");
                                                        String A0R4 = AnonymousClass001.A0R(str2, ":Semantic");
                                                        String A0R5 = AnonymousClass001.A0R(str2, ":Length");
                                                        String A0R6 = AnonymousClass001.A0R(str2, ":Padding");
                                                        String A004 = W6M.A00(A0R3, newPullParser);
                                                        String A005 = W6M.A00(A0R4, newPullParser);
                                                        String A006 = W6M.A00(A0R5, newPullParser);
                                                        String A007 = W6M.A00(A0R6, newPullParser);
                                                        if (A004 != null && A005 != null) {
                                                            if (A006 != null) {
                                                                j = Long.parseLong(A006);
                                                            } else {
                                                                j = 0;
                                                            }
                                                            if (A007 == null) {
                                                                j2 = 0;
                                                            } else {
                                                                j2 = Long.parseLong(A007);
                                                            }
                                                            builder.add((Object) new C69035Vgc(j, A004, j2));
                                                        } else {
                                                            of = ImmutableList.of();
                                                            break;
                                                        }
                                                    }
                                                } while (!W6M.A01(A0R2, newPullParser));
                                                of = builder.build();
                                            }
                                            if (W6M.A01("x:xmpmeta", newPullParser)) {
                                                if (!of.isEmpty() && of.size() >= 2) {
                                                    int size = of.size() - 1;
                                                    long j7 = -1;
                                                    long j8 = -1;
                                                    long j9 = -1;
                                                    long j10 = -1;
                                                    boolean z = false;
                                                    while (true) {
                                                        if (size < 0) {
                                                            break;
                                                        }
                                                        C69035Vgc c69035Vgc = (C69035Vgc) of.get(size);
                                                        boolean equals = "video/mp4".equals(c69035Vgc.A02) | z;
                                                        if (size == 0) {
                                                            j3 = length - c69035Vgc.A01;
                                                            length = 0;
                                                        } else {
                                                            j3 = length;
                                                            length -= c69035Vgc.A00;
                                                        }
                                                        if (equals && length != j3) {
                                                            j10 = j3 - length;
                                                            j9 = length;
                                                            z = false;
                                                        } else {
                                                            z = equals;
                                                        }
                                                        if (size == 0) {
                                                            j7 = length;
                                                            j8 = j3;
                                                            break;
                                                        }
                                                        size--;
                                                    }
                                                    if (j9 != -1 && j10 != -1 && j7 != -1 && j8 != -1) {
                                                        motionPhotoMetadata2 = new MotionPhotoMetadata(j7, j8, j6, j9, j10);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        throw new VCM("Couldn't find xmp metadata", null, 1, true);
                                    }
                                } catch (VCM | NumberFormatException | XmlPullParserException unused) {
                                    AbstractC63374Sil.A04("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                                }
                            }
                            this.A06 = motionPhotoMetadata2;
                            if (motionPhotoMetadata2 != null) {
                                this.A03 = motionPhotoMetadata2.A04;
                            }
                        }
                    } else {
                        xGj.Em8(this.A01);
                    }
                    this.A02 = 0;
                    return 0;
                }
            } else {
                WFa wFa2 = this.A09;
                i = 2;
                wFa2.A0M(2);
                xGj.readFully(wFa2.A02, 0, 2);
                this.A01 = wFa2.A08() - 2;
            }
        } else {
            WFa wFa3 = this.A09;
            wFa3.A0M(2);
            xGj.readFully(wFa3.A02, 0, 2);
            int A08 = wFa3.A08();
            this.A00 = A08;
            if (A08 == 65498) {
                if (this.A03 != -1) {
                    i = 4;
                }
                InterfaceC72026XFo interfaceC72026XFo32 = this.A04;
                interfaceC72026XFo32.getClass();
                interfaceC72026XFo32.ASd();
                C70345WRz.A00(this.A04, -9223372036854775807L);
                i = 6;
            } else {
                if (A08 >= 65488) {
                    if (A08 <= 65497) {
                        return 0;
                    }
                } else if (A08 == 65281) {
                    return 0;
                }
                i = 1;
            }
        }
        this.A02 = i;
        return 0;
    }

    @Override // X.XE1
    public final void EMc(long j, long j2) {
        if (j == 0) {
            this.A02 = 0;
            this.A07 = null;
        } else {
            if (this.A02 != 5) {
                return;
            }
            C70326WRg c70326WRg = this.A07;
            c70326WRg.getClass();
            c70326WRg.EMc(j, j2);
        }
    }

    @Override // X.XE1
    public final boolean EmK(XGj xGj) {
        WFa wFa = this.A09;
        wFa.A0M(2);
        xGj.E3s(wFa.A02, 0, 2);
        if (wFa.A08() != 65496) {
            return false;
        }
        wFa.A0M(2);
        xGj.E3s(wFa.A02, 0, 2);
        int A08 = wFa.A08();
        this.A00 = A08;
        if (A08 == 65504) {
            wFa.A0M(2);
            xGj.E3s(wFa.A02, 0, 2);
            xGj.AB0(wFa.A08() - 2);
            wFa.A0M(2);
            xGj.E3s(wFa.A02, 0, 2);
            A08 = wFa.A08();
            this.A00 = A08;
        }
        if (A08 != 65505) {
            return false;
        }
        xGj.AB0(2);
        wFa.A0M(6);
        xGj.E3s(wFa.A02, 0, 6);
        if (wFa.A0C() != 1165519206 || wFa.A08() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.XE1
    public final void CNe(InterfaceC72026XFo interfaceC72026XFo) {
        this.A04 = interfaceC72026XFo;
    }
}
