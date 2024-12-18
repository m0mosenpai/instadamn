package X;

import android.os.Parcelable;
import com.instagram.api.schemas.StorySmbSupportStickerObject;
import com.instagram.api.schemas.WhatsAppChannelShareToIgStoryStickerTappableObject;
import com.instagram.api.schemas.XDTLazyFloatingContextItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.feed.media.ReelCTAIntf;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.clips.IGTVShoppingInfoIntf;
import com.instagram.reels.question.model.QuestionResponsesModelIntf;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1rC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38801rC {
    public static final C38321qM A00(C1DY c1dy, ImmutablePandoMediaDict immutablePandoMediaDict) {
        C38321qM c38321qM;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        User user;
        ArrayList arrayList8;
        ArrayList arrayList9;
        User user2;
        ArrayList arrayList10;
        ArrayList arrayList11;
        ArrayList arrayList12;
        User user3;
        ArrayList arrayList13;
        ArrayList arrayList14;
        ArrayList arrayList15;
        User user4;
        User user5;
        User user6;
        User user7;
        ArrayList arrayList16;
        ArrayList arrayList17;
        ArrayList arrayList18;
        ArrayList arrayList19;
        ArrayList arrayList20;
        ArrayList arrayList21;
        ArrayList arrayList22;
        ArrayList arrayList23;
        ArrayList arrayList24;
        ArrayList arrayList25;
        ArrayList arrayList26;
        ArrayList arrayList27;
        ArrayList arrayList28;
        ArrayList arrayList29;
        ArrayList arrayList30;
        ArrayList arrayList31;
        ArrayList arrayList32;
        ArrayList arrayList33;
        ArrayList arrayList34;
        ArrayList arrayList35;
        ArrayList arrayList36;
        ArrayList arrayList37;
        ArrayList arrayList38;
        ArrayList arrayList39;
        ArrayList arrayList40;
        ArrayList arrayList41;
        ArrayList arrayList42;
        ArrayList arrayList43;
        ArrayList arrayList44;
        ArrayList arrayList45;
        ArrayList arrayList46;
        ArrayList arrayList47;
        ArrayList arrayList48;
        ArrayList arrayList49;
        ArrayList arrayList50;
        ArrayList arrayList51;
        ArrayList arrayList52;
        ArrayList arrayList53;
        ArrayList arrayList54;
        ArrayList arrayList55;
        ArrayList arrayList56;
        ArrayList arrayList57;
        ArrayList arrayList58;
        ArrayList arrayList59;
        ArrayList arrayList60;
        ArrayList arrayList61;
        ArrayList arrayList62;
        ArrayList arrayList63;
        ArrayList arrayList64;
        ArrayList arrayList65;
        ArrayList arrayList66;
        ArrayList arrayList67;
        ArrayList arrayList68;
        ArrayList arrayList69;
        ArrayList arrayList70;
        ArrayList arrayList71;
        ArrayList arrayList72;
        ArrayList arrayList73;
        ArrayList arrayList74;
        ArrayList arrayList75;
        ArrayList arrayList76;
        ArrayList arrayList77;
        User user8;
        ArrayList arrayList78;
        C14360o3.A0B(immutablePandoMediaDict, 0);
        C1DV c1dv = c1dy.A00;
        UserSession CE4 = c1dv.CE4();
        if (CE4 != null) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, CE4, 36317925628516044L)) {
                C84483pr c84483pr = new C84483pr(immutablePandoMediaDict);
                if (C18U.A06(c06090Tz, CE4, 36317925628647117L)) {
                    c84483pr.A0f = c84483pr.A0P._allPreviousSubmitters$fbandroid_java_com_instagram_feed_media_media(c1dy);
                    List<InterfaceC102164im> Aeh = c84483pr.Aeh();
                    ArrayList arrayList79 = null;
                    if (Aeh != null) {
                        arrayList = new ArrayList(AbstractC06950Ym.A1E(Aeh, 10));
                        for (InterfaceC102164im interfaceC102164im : Aeh) {
                            interfaceC102164im.E9z(c1dy);
                            arrayList.add(interfaceC102164im);
                        }
                    } else {
                        arrayList = null;
                    }
                    c84483pr.A0g = arrayList;
                    List<InterfaceC37271GbO> AgH = c84483pr.AgH();
                    if (AgH != null) {
                        arrayList2 = new ArrayList(AbstractC06950Ym.A1E(AgH, 10));
                        for (InterfaceC37271GbO interfaceC37271GbO : AgH) {
                            interfaceC37271GbO.E8k(c1dy);
                            arrayList2.add(interfaceC37271GbO);
                        }
                    } else {
                        arrayList2 = null;
                    }
                    c84483pr.A0h = arrayList2;
                    List<InterfaceC43551JLl> Ai3 = c84483pr.Ai3();
                    if (Ai3 != null) {
                        arrayList3 = new ArrayList(AbstractC06950Ym.A1E(Ai3, 10));
                        for (InterfaceC43551JLl interfaceC43551JLl : Ai3) {
                            interfaceC43551JLl.E8i(c1dy);
                            arrayList3.add(interfaceC43551JLl);
                        }
                    } else {
                        arrayList3 = null;
                    }
                    c84483pr.A0i = arrayList3;
                    InterfaceC38901rP Alb = c84483pr.Alb();
                    if (Alb != null) {
                        Alb.EBK(c1dy);
                    } else {
                        Alb = null;
                    }
                    c84483pr.A0J = Alb;
                    AnonymousClass520 Ald = c84483pr.Ald();
                    if (Ald != null) {
                        Ald.E8n(c1dy);
                    } else {
                        Ald = null;
                    }
                    c84483pr.A00 = Ald;
                    c84483pr.A0j = c84483pr.A0P._carouselMedia$fbandroid_java_com_instagram_feed_media_media(c1dy);
                    c84483pr.A0k = c84483pr.A0P._chicletStorefronts$fbandroid_java_com_instagram_feed_media_media(c1dy);
                    InterfaceC31131DmE AoB = c84483pr.AoB();
                    if (AoB != null) {
                        AoB.EBG(c1dy);
                    } else {
                        AoB = null;
                    }
                    c84483pr.A0G = AoB;
                    List<InterfaceC73614YQc> AoD = c84483pr.AoD();
                    if (AoD != null) {
                        arrayList4 = new ArrayList(AbstractC06950Ym.A1E(AoD, 10));
                        for (InterfaceC73614YQc interfaceC73614YQc : AoD) {
                            interfaceC73614YQc.EA3(c1dy);
                            arrayList4.add(interfaceC73614YQc);
                        }
                    } else {
                        arrayList4 = null;
                    }
                    c84483pr.A0l = arrayList4;
                    List<YQW> AoQ = c84483pr.AoQ();
                    if (AoQ != null) {
                        arrayList5 = new ArrayList(AbstractC06950Ym.A1E(AoQ, 10));
                        for (YQW yqw : AoQ) {
                            yqw.E9B(c1dy);
                            arrayList5.add(yqw);
                        }
                    } else {
                        arrayList5 = null;
                    }
                    c84483pr.A0m = arrayList5;
                    C3x9 clipsMetadata = c84483pr.getClipsMetadata();
                    if (clipsMetadata != null) {
                        clipsMetadata.EBI(c1dy);
                    } else {
                        clipsMetadata = null;
                    }
                    c84483pr.A0I = clipsMetadata;
                    InterfaceC31132DmF AoZ = c84483pr.AoZ();
                    if (AoZ != null) {
                        AoZ.EBO(c1dy);
                    } else {
                        AoZ = null;
                    }
                    c84483pr.A0N = AoZ;
                    List<YR3> Aod = c84483pr.Aod();
                    if (Aod != null) {
                        arrayList6 = new ArrayList(AbstractC06950Ym.A1E(Aod, 10));
                        for (YR3 yr3 : Aod) {
                            yr3.EB6(c1dy);
                            arrayList6.add(yr3);
                        }
                    } else {
                        arrayList6 = null;
                    }
                    c84483pr.A0n = arrayList6;
                    c84483pr.A0o = c84483pr.A0P._coauthorProducers$fbandroid_java_com_instagram_feed_media_media(c1dy);
                    c84483pr.A0p = c84483pr.A0P._collectionMedia$fbandroid_java_com_instagram_feed_media_media(c1dy);
                    List<InterfaceC38901rP> Apm = c84483pr.Apm();
                    if (Apm != null) {
                        arrayList7 = new ArrayList(AbstractC06950Ym.A1E(Apm, 10));
                        for (InterfaceC38901rP interfaceC38901rP : Apm) {
                            interfaceC38901rP.EBK(c1dy);
                            arrayList7.add(interfaceC38901rP);
                        }
                    } else {
                        arrayList7 = null;
                    }
                    c84483pr.A0q = arrayList7;
                    JMR ArZ = c84483pr.ArZ();
                    if (ArZ != null) {
                        ArZ.E8u(c1dy);
                    } else {
                        ArZ = null;
                    }
                    c84483pr.A01 = ArZ;
                    JM3 Arn = c84483pr.Arn();
                    if (Arn != null) {
                        Arn.E8v(c1dy);
                    } else {
                        Arn = null;
                    }
                    c84483pr.A02 = Arn;
                    InterfaceC120925dk AsX = c84483pr.AsX();
                    if (AsX != null) {
                        AsX.E8w(c1dy);
                    } else {
                        AsX = null;
                    }
                    c84483pr.A03 = AsX;
                    CreativeConfigIntf Asm = c84483pr.Asm();
                    if (Asm != null) {
                        Asm.EBM(c1dy);
                    } else {
                        Asm = null;
                    }
                    c84483pr.A0L = Asm;
                    InterfaceC43547JLh Ayz = c84483pr.Ayz();
                    if (Ayz != null) {
                        Ayz.EC0(c1dy);
                    } else {
                        Ayz = null;
                    }
                    c84483pr.A0V = Ayz;
                    ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) c84483pr.A0P.A05(-101001172, ImmutablePandoUserDict.class);
                    if (immutablePandoUserDict != null) {
                        Parcelable.Creator creator = User.CREATOR;
                        user = AbstractC38851rI.A01(c1dy, immutablePandoUserDict);
                    } else {
                        user = null;
                    }
                    c84483pr.A0X = user;
                    c84483pr.A0r = c84483pr.A0P._e2eeMentionedUserList$fbandroid_java_com_instagram_feed_media_media(c1dy);
                    c84483pr.A0s = c84483pr.A0P._facepileTopLikers$fbandroid_java_com_instagram_feed_media_media(c1dy);
                    List<InterfaceC43546JLg> B5P = c84483pr.B5P();
                    if (B5P != null) {
                        arrayList8 = new ArrayList(AbstractC06950Ym.A1E(B5P, 10));
                        for (InterfaceC43546JLg interfaceC43546JLg : B5P) {
                            interfaceC43546JLg.EBp(c1dy);
                            arrayList8.add(interfaceC43546JLg);
                        }
                    } else {
                        arrayList8 = null;
                    }
                    c84483pr.A0t = arrayList8;
                    JMF B5y = c84483pr.B5y();
                    if (B5y != null) {
                        B5y.EBN(c1dy);
                    } else {
                        B5y = null;
                    }
                    c84483pr.A0M = B5y;
                    List<XDTLazyFloatingContextItem> B74 = c84483pr.B74();
                    if (B74 != null) {
                        arrayList9 = new ArrayList(AbstractC06950Ym.A1E(B74, 10));
                        for (XDTLazyFloatingContextItem xDTLazyFloatingContextItem : B74) {
                            xDTLazyFloatingContextItem.EBF(c1dy);
                            arrayList9.add(xDTLazyFloatingContextItem);
                        }
                    } else {
                        arrayList9 = null;
                    }
                    c84483pr.A0u = arrayList9;
                    ImmutablePandoUserDict immutablePandoUserDict2 = (ImmutablePandoUserDict) c84483pr.A0P.A05(98629247, ImmutablePandoUserDict.class);
                    if (immutablePandoUserDict2 != null) {
                        Parcelable.Creator creator2 = User.CREATOR;
                        user2 = AbstractC38851rI.A01(c1dy, immutablePandoUserDict2);
                    } else {
                        user2 = null;
                    }
                    c84483pr.A0Y = user2;
                    List<InterfaceC73622YQk> BAb = c84483pr.BAb();
                    if (BAb != null) {
                        arrayList10 = new ArrayList(AbstractC06950Ym.A1E(BAb, 10));
                        for (InterfaceC73622YQk interfaceC73622YQk : BAb) {
                            interfaceC73622YQk.EAG(c1dy);
                            arrayList10.add(interfaceC73622YQk);
                        }
                    } else {
                        arrayList10 = null;
                    }
                    c84483pr.A0v = arrayList10;
                    JMX BAo = c84483pr.BAo();
                    if (BAo != null) {
                        BAo.EBP(c1dy);
                    } else {
                        BAo = null;
                    }
                    c84483pr.A0O = BAo;
                    InterfaceC38901rP BDL = c84483pr.BDL();
                    if (BDL != null) {
                        BDL.EBK(c1dy);
                    } else {
                        BDL = null;
                    }
                    c84483pr.A0K = BDL;
                    c84483pr.A0w = c84483pr.A0P._hscrollItems$fbandroid_java_com_instagram_feed_media_media(c1dy);
                    IGTVShoppingInfoIntf BGP = c84483pr.BGP();
                    if (BGP != null) {
                        BGP.EBo(c1dy);
                    } else {
                        BGP = null;
                    }
                    c84483pr.A0U = BGP;
                    InterfaceC39541sb injected = c84483pr.getInjected();
                    if (injected != null) {
                        injected.EBX(c1dy);
                    } else {
                        injected = null;
                    }
                    c84483pr.A0R = injected;
                    c84483pr.A0x = c84483pr.A0P._invitedCoauthorProducers$fbandroid_java_com_instagram_feed_media_media(c1dy);
                    InterfaceC84163p3 BPh = c84483pr.BPh();
                    if (BPh != null) {
                        BPh.EBH(c1dy);
                    } else {
                        BPh = null;
                    }
                    c84483pr.A0H = BPh;
                    InterfaceC84363pT BRI = c84483pr.BRI();
                    if (BRI != null) {
                        BRI.E9D(c1dy);
                    } else {
                        BRI = null;
                    }
                    c84483pr.A06 = BRI;
                    InterfaceC31134DmH BRQ = c84483pr.BRQ();
                    if (BRQ != null) {
                        BRQ.E9E(c1dy);
                    } else {
                        BRQ = null;
                    }
                    c84483pr.A07 = BRQ;
                    List<InterfaceC73614YQc> BT5 = c84483pr.BT5();
                    if (BT5 != null) {
                        arrayList11 = new ArrayList(AbstractC06950Ym.A1E(BT5, 10));
                        for (InterfaceC73614YQc interfaceC73614YQc2 : BT5) {
                            interfaceC73614YQc2.EA3(c1dy);
                            arrayList11.add(interfaceC73614YQc2);
                        }
                    } else {
                        arrayList11 = null;
                    }
                    c84483pr.A0y = arrayList11;
                    C3XR musicMetadata = c84483pr.getMusicMetadata();
                    if (musicMetadata != null) {
                        musicMetadata.E9P(c1dy);
                    } else {
                        musicMetadata = null;
                    }
                    c84483pr.A08 = musicMetadata;
                    InterfaceC31135DmI BfC = c84483pr.BfC();
                    if (BfC != null) {
                        BfC.EBU(c1dy);
                    } else {
                        BfC = null;
                    }
                    c84483pr.A0Q = BfC;
                    InterfaceC106814ri BfZ = c84483pr.BfZ();
                    if (BfZ != null) {
                        BfZ.E9d(c1dy);
                    } else {
                        BfZ = null;
                    }
                    c84483pr.A09 = BfZ;
                    List<InterfaceC38901rP> Bfl = c84483pr.Bfl();
                    if (Bfl != null) {
                        arrayList12 = new ArrayList(AbstractC06950Ym.A1E(Bfl, 10));
                        for (InterfaceC38901rP interfaceC38901rP2 : Bfl) {
                            interfaceC38901rP2.EBK(c1dy);
                            arrayList12.add(interfaceC38901rP2);
                        }
                    } else {
                        arrayList12 = null;
                    }
                    c84483pr.A0z = arrayList12;
                    ImmutablePandoUserDict immutablePandoUserDict3 = (ImmutablePandoUserDict) c84483pr.A0P.A05(-2031807039, ImmutablePandoUserDict.class);
                    if (immutablePandoUserDict3 != null) {
                        Parcelable.Creator creator3 = User.CREATOR;
                        user3 = AbstractC38851rI.A01(c1dy, immutablePandoUserDict3);
                    } else {
                        user3 = null;
                    }
                    c84483pr.A0Z = user3;
                    JMT Bgt = c84483pr.Bgt();
                    if (Bgt != null) {
                        Bgt.E94(c1dy);
                    } else {
                        Bgt = null;
                    }
                    c84483pr.A05 = Bgt;
                    List<JL5> BhK = c84483pr.BhK();
                    if (BhK != null) {
                        arrayList13 = new ArrayList(AbstractC06950Ym.A1E(BhK, 10));
                        for (JL5 jl5 : BhK) {
                            jl5.E9g(c1dy);
                            arrayList13.add(jl5);
                        }
                    } else {
                        arrayList13 = null;
                    }
                    c84483pr.A10 = arrayList13;
                    InterfaceC111164zd BhM = c84483pr.BhM();
                    if (BhM != null) {
                        BhM.E93(c1dy);
                    } else {
                        BhM = null;
                    }
                    c84483pr.A04 = BhM;
                    List<JMS> Bl2 = c84483pr.Bl2();
                    if (Bl2 != null) {
                        arrayList14 = new ArrayList(AbstractC06950Ym.A1E(Bl2, 10));
                        for (JMS jms : Bl2) {
                            jms.E8x(c1dy);
                            arrayList14.add(jms);
                        }
                    } else {
                        arrayList14 = null;
                    }
                    c84483pr.A11 = arrayList14;
                    List<AnonymousClass447> Blj = c84483pr.Blj();
                    if (Blj != null) {
                        arrayList15 = new ArrayList(AbstractC06950Ym.A1E(Blj, 10));
                        for (AnonymousClass447 anonymousClass447 : Blj) {
                            anonymousClass447.E9H(c1dy);
                            arrayList15.add(anonymousClass447);
                        }
                    } else {
                        arrayList15 = null;
                    }
                    c84483pr.A12 = arrayList15;
                    JML Bns = c84483pr.Bns();
                    if (Bns != null) {
                        Bns.E9n(c1dy);
                    } else {
                        Bns = null;
                    }
                    c84483pr.A0A = Bns;
                    ImmutablePandoUserDict immutablePandoUserDict4 = (ImmutablePandoUserDict) c84483pr.A0P.A05(-1810364042, ImmutablePandoUserDict.class);
                    if (immutablePandoUserDict4 != null) {
                        Parcelable.Creator creator4 = User.CREATOR;
                        user4 = AbstractC38851rI.A01(c1dy, immutablePandoUserDict4);
                    } else {
                        user4 = null;
                    }
                    c84483pr.A0a = user4;
                    ImmutablePandoUserDict immutablePandoUserDict5 = (ImmutablePandoUserDict) c84483pr.A0P.A05(1625671202, ImmutablePandoUserDict.class);
                    if (immutablePandoUserDict5 != null) {
                        Parcelable.Creator creator5 = User.CREATOR;
                        user5 = AbstractC38851rI.A01(c1dy, immutablePandoUserDict5);
                    } else {
                        user5 = null;
                    }
                    c84483pr.A0b = user5;
                    ImmutablePandoUserDict immutablePandoUserDict6 = (ImmutablePandoUserDict) c84483pr.A0P.A05(-1446568809, ImmutablePandoUserDict.class);
                    if (immutablePandoUserDict6 != null) {
                        Parcelable.Creator creator6 = User.CREATOR;
                        user6 = AbstractC38851rI.A01(c1dy, immutablePandoUserDict6);
                    } else {
                        user6 = null;
                    }
                    c84483pr.A0c = user6;
                    c84483pr.A13 = c84483pr.A0P._senders$fbandroid_java_com_instagram_feed_media_media(c1dy);
                    ImmutablePandoUserDict immutablePandoUserDict7 = (ImmutablePandoUserDict) c84483pr.A0P.A05(1066223914, ImmutablePandoUserDict.class);
                    if (immutablePandoUserDict7 != null) {
                        Parcelable.Creator creator7 = User.CREATOR;
                        user7 = AbstractC38851rI.A01(c1dy, immutablePandoUserDict7);
                    } else {
                        user7 = null;
                    }
                    c84483pr.A0d = user7;
                    c84483pr.A14 = c84483pr.A0P._showcaseMedia$fbandroid_java_com_instagram_feed_media_media(c1dy);
                    List<InterfaceC87503vI> ByK = c84483pr.ByK();
                    if (ByK != null) {
                        arrayList16 = new ArrayList(AbstractC06950Ym.A1E(ByK, 10));
                        for (InterfaceC87503vI interfaceC87503vI : ByK) {
                            interfaceC87503vI.E9t(c1dy);
                            arrayList16.add(interfaceC87503vI);
                        }
                    } else {
                        arrayList16 = null;
                    }
                    c84483pr.A15 = arrayList16;
                    List<InterfaceC102194ip> sponsorTags = c84483pr.getSponsorTags();
                    if (sponsorTags != null) {
                        arrayList17 = new ArrayList(AbstractC06950Ym.A1E(sponsorTags, 10));
                        for (InterfaceC102194ip interfaceC102194ip : sponsorTags) {
                            interfaceC102194ip.E9u(c1dy);
                            arrayList17.add(interfaceC102194ip);
                        }
                    } else {
                        arrayList17 = null;
                    }
                    c84483pr.A16 = arrayList17;
                    List<YQU> C15 = c84483pr.C15();
                    if (C15 != null) {
                        arrayList18 = new ArrayList(AbstractC06950Ym.A1E(C15, 10));
                        for (YQU yqu : C15) {
                            yqu.E9w(c1dy);
                            arrayList18.add(yqu);
                        }
                    } else {
                        arrayList18 = null;
                    }
                    c84483pr.A17 = arrayList18;
                    InterfaceC39751sy C17 = c84483pr.C17();
                    if (C17 != null) {
                        C17.EBk(c1dy);
                    } else {
                        C17 = null;
                    }
                    c84483pr.A0T = C17;
                    List<YQY> C18 = c84483pr.C18();
                    if (C18 != null) {
                        arrayList19 = new ArrayList(AbstractC06950Ym.A1E(C18, 10));
                        for (YQY yqy : C18) {
                            yqy.E9x(c1dy);
                            arrayList19.add(yqy);
                        }
                    } else {
                        arrayList19 = null;
                    }
                    c84483pr.A18 = arrayList19;
                    List<YQZ> C19 = c84483pr.C19();
                    if (C19 != null) {
                        arrayList20 = new ArrayList(AbstractC06950Ym.A1E(C19, 10));
                        for (YQZ yqz : C19) {
                            yqz.E9y(c1dy);
                            arrayList20.add(yqz);
                        }
                    } else {
                        arrayList20 = null;
                    }
                    c84483pr.A19 = arrayList20;
                    List<YR1> C1D = c84483pr.C1D();
                    if (C1D != null) {
                        arrayList21 = new ArrayList(AbstractC06950Ym.A1E(C1D, 10));
                        for (YR1 yr1 : C1D) {
                            yr1.EAp(c1dy);
                            arrayList21.add(yr1);
                        }
                    } else {
                        arrayList21 = null;
                    }
                    c84483pr.A1A = arrayList21;
                    List<InterfaceC43581JMp> C1F = c84483pr.C1F();
                    if (C1F != null) {
                        arrayList22 = new ArrayList(AbstractC06950Ym.A1E(C1F, 10));
                        for (InterfaceC43581JMp interfaceC43581JMp : C1F) {
                            interfaceC43581JMp.EA0(c1dy);
                            arrayList22.add(interfaceC43581JMp);
                        }
                    } else {
                        arrayList22 = null;
                    }
                    c84483pr.A1B = arrayList22;
                    List<InterfaceC73612YQa> C1G = c84483pr.C1G();
                    if (C1G != null) {
                        arrayList23 = new ArrayList(AbstractC06950Ym.A1E(C1G, 10));
                        for (InterfaceC73612YQa interfaceC73612YQa : C1G) {
                            interfaceC73612YQa.EA1(c1dy);
                            arrayList23.add(interfaceC73612YQa);
                        }
                    } else {
                        arrayList23 = null;
                    }
                    c84483pr.A1C = arrayList23;
                    List<InterfaceC73613YQb> C1I = c84483pr.C1I();
                    if (C1I != null) {
                        arrayList24 = new ArrayList(AbstractC06950Ym.A1E(C1I, 10));
                        for (InterfaceC73613YQb interfaceC73613YQb : C1I) {
                            interfaceC73613YQb.EA2(c1dy);
                            arrayList24.add(interfaceC73613YQb);
                        }
                    } else {
                        arrayList24 = null;
                    }
                    c84483pr.A1D = arrayList24;
                    List<InterfaceC73614YQc> C1K = c84483pr.C1K();
                    if (C1K != null) {
                        arrayList25 = new ArrayList(AbstractC06950Ym.A1E(C1K, 10));
                        for (InterfaceC73614YQc interfaceC73614YQc3 : C1K) {
                            interfaceC73614YQc3.EA3(c1dy);
                            arrayList25.add(interfaceC73614YQc3);
                        }
                    } else {
                        arrayList25 = null;
                    }
                    c84483pr.A1E = arrayList25;
                    List<InterfaceC38901rP> C1L = c84483pr.C1L();
                    if (C1L != null) {
                        arrayList26 = new ArrayList(AbstractC06950Ym.A1E(C1L, 10));
                        for (InterfaceC38901rP interfaceC38901rP3 : C1L) {
                            interfaceC38901rP3.EBK(c1dy);
                            arrayList26.add(interfaceC38901rP3);
                        }
                    } else {
                        arrayList26 = null;
                    }
                    c84483pr.A1F = arrayList26;
                    List<InterfaceC73615YQd> C1M = c84483pr.C1M();
                    if (C1M != null) {
                        arrayList27 = new ArrayList(AbstractC06950Ym.A1E(C1M, 10));
                        for (InterfaceC73615YQd interfaceC73615YQd : C1M) {
                            interfaceC73615YQd.EA5(c1dy);
                            arrayList27.add(interfaceC73615YQd);
                        }
                    } else {
                        arrayList27 = null;
                    }
                    c84483pr.A1G = arrayList27;
                    List<ReelCTAIntf> C1N = c84483pr.C1N();
                    if (C1N != null) {
                        arrayList28 = new ArrayList(AbstractC06950Ym.A1E(C1N, 10));
                        for (ReelCTAIntf reelCTAIntf : C1N) {
                            reelCTAIntf.EBV(c1dy);
                            arrayList28.add(reelCTAIntf);
                        }
                    } else {
                        arrayList28 = null;
                    }
                    c84483pr.A1H = arrayList28;
                    List<InterfaceC73616YQe> C1R = c84483pr.C1R();
                    if (C1R != null) {
                        arrayList29 = new ArrayList(AbstractC06950Ym.A1E(C1R, 10));
                        for (InterfaceC73616YQe interfaceC73616YQe : C1R) {
                            interfaceC73616YQe.EA6(c1dy);
                            arrayList29.add(interfaceC73616YQe);
                        }
                    } else {
                        arrayList29 = null;
                    }
                    c84483pr.A1I = arrayList29;
                    List<YQV> C1T = c84483pr.C1T();
                    if (C1T != null) {
                        arrayList30 = new ArrayList(AbstractC06950Ym.A1E(C1T, 10));
                        for (YQV yqv : C1T) {
                            yqv.E91(c1dy);
                            arrayList30.add(yqv);
                        }
                    } else {
                        arrayList30 = null;
                    }
                    c84483pr.A1J = arrayList30;
                    List<InterfaceC73617YQf> C1U = c84483pr.C1U();
                    if (C1U != null) {
                        arrayList31 = new ArrayList(AbstractC06950Ym.A1E(C1U, 10));
                        for (InterfaceC73617YQf interfaceC73617YQf : C1U) {
                            interfaceC73617YQf.EA7(c1dy);
                            arrayList31.add(interfaceC73617YQf);
                        }
                    } else {
                        arrayList31 = null;
                    }
                    c84483pr.A1K = arrayList31;
                    List<YR5> C1V = c84483pr.C1V();
                    if (C1V != null) {
                        arrayList32 = new ArrayList(AbstractC06950Ym.A1E(C1V, 10));
                        for (YR5 yr5 : C1V) {
                            yr5.EA8(c1dy);
                            arrayList32.add(yr5);
                        }
                    } else {
                        arrayList32 = null;
                    }
                    c84483pr.A1L = arrayList32;
                    List<InterfaceC73618YQg> C1W = c84483pr.C1W();
                    if (C1W != null) {
                        arrayList33 = new ArrayList(AbstractC06950Ym.A1E(C1W, 10));
                        for (InterfaceC73618YQg interfaceC73618YQg : C1W) {
                            interfaceC73618YQg.EA9(c1dy);
                            arrayList33.add(interfaceC73618YQg);
                        }
                    } else {
                        arrayList33 = null;
                    }
                    c84483pr.A1M = arrayList33;
                    List<InterfaceC73619YQh> C1X = c84483pr.C1X();
                    if (C1X != null) {
                        arrayList34 = new ArrayList(AbstractC06950Ym.A1E(C1X, 10));
                        for (InterfaceC73619YQh interfaceC73619YQh : C1X) {
                            interfaceC73619YQh.EAA(c1dy);
                            arrayList34.add(interfaceC73619YQh);
                        }
                    } else {
                        arrayList34 = null;
                    }
                    c84483pr.A1N = arrayList34;
                    List<InterfaceC84683qH> C1Y = c84483pr.C1Y();
                    if (C1Y != null) {
                        arrayList35 = new ArrayList(AbstractC06950Ym.A1E(C1Y, 10));
                        for (InterfaceC84683qH interfaceC84683qH : C1Y) {
                            interfaceC84683qH.EAC(c1dy);
                            arrayList35.add(interfaceC84683qH);
                        }
                    } else {
                        arrayList35 = null;
                    }
                    c84483pr.A1O = arrayList35;
                    List<InterfaceC73620YQi> C1Z = c84483pr.C1Z();
                    if (C1Z != null) {
                        arrayList36 = new ArrayList(AbstractC06950Ym.A1E(C1Z, 10));
                        for (InterfaceC73620YQi interfaceC73620YQi : C1Z) {
                            interfaceC73620YQi.EAB(c1dy);
                            arrayList36.add(interfaceC73620YQi);
                        }
                    } else {
                        arrayList36 = null;
                    }
                    c84483pr.A1P = arrayList36;
                    List<JMA> C1a = c84483pr.C1a();
                    if (C1a != null) {
                        arrayList37 = new ArrayList(AbstractC06950Ym.A1E(C1a, 10));
                        for (JMA jma : C1a) {
                            jma.EAD(c1dy);
                            arrayList37.add(jma);
                        }
                    } else {
                        arrayList37 = null;
                    }
                    c84483pr.A1Q = arrayList37;
                    List<InterfaceC73621YQj> C1b = c84483pr.C1b();
                    if (C1b != null) {
                        arrayList38 = new ArrayList(AbstractC06950Ym.A1E(C1b, 10));
                        for (InterfaceC73621YQj interfaceC73621YQj : C1b) {
                            interfaceC73621YQj.EAE(c1dy);
                            arrayList38.add(interfaceC73621YQj);
                        }
                    } else {
                        arrayList38 = null;
                    }
                    c84483pr.A1R = arrayList38;
                    List<C5KP> C1d = c84483pr.C1d();
                    if (C1d != null) {
                        arrayList39 = new ArrayList(AbstractC06950Ym.A1E(C1d, 10));
                        for (C5KP c5kp : C1d) {
                            c5kp.EAH(c1dy);
                            arrayList39.add(c5kp);
                        }
                    } else {
                        arrayList39 = null;
                    }
                    c84483pr.A1S = arrayList39;
                    List<YR6> C1e = c84483pr.C1e();
                    if (C1e != null) {
                        arrayList40 = new ArrayList(AbstractC06950Ym.A1E(C1e, 10));
                        for (YR6 yr6 : C1e) {
                            yr6.EAI(c1dy);
                            arrayList40.add(yr6);
                        }
                    } else {
                        arrayList40 = null;
                    }
                    c84483pr.A1T = arrayList40;
                    List<InterfaceC73623YQl> C1f = c84483pr.C1f();
                    if (C1f != null) {
                        arrayList41 = new ArrayList(AbstractC06950Ym.A1E(C1f, 10));
                        for (InterfaceC73623YQl interfaceC73623YQl : C1f) {
                            interfaceC73623YQl.EAJ(c1dy);
                            arrayList41.add(interfaceC73623YQl);
                        }
                    } else {
                        arrayList41 = null;
                    }
                    c84483pr.A1U = arrayList41;
                    List<InterfaceC108154u0> C1i = c84483pr.C1i();
                    if (C1i != null) {
                        arrayList42 = new ArrayList(AbstractC06950Ym.A1E(C1i, 10));
                        for (InterfaceC108154u0 interfaceC108154u0 : C1i) {
                            interfaceC108154u0.EAK(c1dy);
                            arrayList42.add(interfaceC108154u0);
                        }
                    } else {
                        arrayList42 = null;
                    }
                    c84483pr.A1V = arrayList42;
                    List<InterfaceC1123955r> C1j = c84483pr.C1j();
                    if (C1j != null) {
                        arrayList43 = new ArrayList(AbstractC06950Ym.A1E(C1j, 10));
                        for (InterfaceC1123955r interfaceC1123955r : C1j) {
                            interfaceC1123955r.EBY(c1dy);
                            arrayList43.add(interfaceC1123955r);
                        }
                    } else {
                        arrayList43 = null;
                    }
                    c84483pr.A1W = arrayList43;
                    InterfaceC37269GbM C1k = c84483pr.C1k();
                    if (C1k != null) {
                        C1k.EAL(c1dy);
                    } else {
                        C1k = null;
                    }
                    c84483pr.A0C = C1k;
                    List<InterfaceC73624YQm> C1l = c84483pr.C1l();
                    if (C1l != null) {
                        arrayList44 = new ArrayList(AbstractC06950Ym.A1E(C1l, 10));
                        for (InterfaceC73624YQm interfaceC73624YQm : C1l) {
                            interfaceC73624YQm.EAO(c1dy);
                            arrayList44.add(interfaceC73624YQm);
                        }
                    } else {
                        arrayList44 = null;
                    }
                    c84483pr.A1X = arrayList44;
                    List<InterfaceC109274vt> C1m = c84483pr.C1m();
                    if (C1m != null) {
                        arrayList45 = new ArrayList(AbstractC06950Ym.A1E(C1m, 10));
                        for (InterfaceC109274vt interfaceC109274vt : C1m) {
                            interfaceC109274vt.E9l(c1dy);
                            arrayList45.add(interfaceC109274vt);
                        }
                    } else {
                        arrayList45 = null;
                    }
                    c84483pr.A1Y = arrayList45;
                    List<InterfaceC73625YQn> C1n = c84483pr.C1n();
                    if (C1n != null) {
                        arrayList46 = new ArrayList(AbstractC06950Ym.A1E(C1n, 10));
                        for (InterfaceC73625YQn interfaceC73625YQn : C1n) {
                            interfaceC73625YQn.EAQ(c1dy);
                            arrayList46.add(interfaceC73625YQn);
                        }
                    } else {
                        arrayList46 = null;
                    }
                    c84483pr.A1Z = arrayList46;
                    List<C4A3> C1o = c84483pr.C1o();
                    if (C1o != null) {
                        arrayList47 = new ArrayList(AbstractC06950Ym.A1E(C1o, 10));
                        for (C4A3 c4a3 : C1o) {
                            c4a3.EAR(c1dy);
                            arrayList47.add(c4a3);
                        }
                    } else {
                        arrayList47 = null;
                    }
                    c84483pr.A1a = arrayList47;
                    List<InterfaceC73626YQo> C1p = c84483pr.C1p();
                    if (C1p != null) {
                        arrayList48 = new ArrayList(AbstractC06950Ym.A1E(C1p, 10));
                        for (InterfaceC73626YQo interfaceC73626YQo : C1p) {
                            interfaceC73626YQo.EAS(c1dy);
                            arrayList48.add(interfaceC73626YQo);
                        }
                    } else {
                        arrayList48 = null;
                    }
                    c84483pr.A1b = arrayList48;
                    List<InterfaceC73627YQp> C1q = c84483pr.C1q();
                    if (C1q != null) {
                        arrayList49 = new ArrayList(AbstractC06950Ym.A1E(C1q, 10));
                        for (InterfaceC73627YQp interfaceC73627YQp : C1q) {
                            interfaceC73627YQp.EAT(c1dy);
                            arrayList49.add(interfaceC73627YQp);
                        }
                    } else {
                        arrayList49 = null;
                    }
                    c84483pr.A1c = arrayList49;
                    List<InterfaceC73628YQq> C1r = c84483pr.C1r();
                    if (C1r != null) {
                        arrayList50 = new ArrayList(AbstractC06950Ym.A1E(C1r, 10));
                        for (InterfaceC73628YQq interfaceC73628YQq : C1r) {
                            interfaceC73628YQq.EAU(c1dy);
                            arrayList50.add(interfaceC73628YQq);
                        }
                    } else {
                        arrayList50 = null;
                    }
                    c84483pr.A1d = arrayList50;
                    List<InterfaceC37276GbT> C1s = c84483pr.C1s();
                    if (C1s != null) {
                        arrayList51 = new ArrayList(AbstractC06950Ym.A1E(C1s, 10));
                        for (InterfaceC37276GbT interfaceC37276GbT : C1s) {
                            interfaceC37276GbT.EC6(c1dy);
                            arrayList51.add(interfaceC37276GbT);
                        }
                    } else {
                        arrayList51 = null;
                    }
                    c84483pr.A1e = arrayList51;
                    List<InterfaceC73629YQr> C1t = c84483pr.C1t();
                    if (C1t != null) {
                        arrayList52 = new ArrayList(AbstractC06950Ym.A1E(C1t, 10));
                        for (InterfaceC73629YQr interfaceC73629YQr : C1t) {
                            interfaceC73629YQr.EAV(c1dy);
                            arrayList52.add(interfaceC73629YQr);
                        }
                    } else {
                        arrayList52 = null;
                    }
                    c84483pr.A1f = arrayList52;
                    List<InterfaceC73630YQs> C1u = c84483pr.C1u();
                    if (C1u != null) {
                        arrayList53 = new ArrayList(AbstractC06950Ym.A1E(C1u, 10));
                        for (InterfaceC73630YQs interfaceC73630YQs : C1u) {
                            interfaceC73630YQs.EAW(c1dy);
                            arrayList53.add(interfaceC73630YQs);
                        }
                    } else {
                        arrayList53 = null;
                    }
                    c84483pr.A1g = arrayList53;
                    List<InterfaceC73631YQt> C1v = c84483pr.C1v();
                    if (C1v != null) {
                        arrayList54 = new ArrayList(AbstractC06950Ym.A1E(C1v, 10));
                        for (InterfaceC73631YQt interfaceC73631YQt : C1v) {
                            interfaceC73631YQt.EAX(c1dy);
                            arrayList54.add(interfaceC73631YQt);
                        }
                    } else {
                        arrayList54 = null;
                    }
                    c84483pr.A1h = arrayList54;
                    List<YR8> C1x = c84483pr.C1x();
                    if (C1x != null) {
                        arrayList55 = new ArrayList(AbstractC06950Ym.A1E(C1x, 10));
                        for (YR8 yr8 : C1x) {
                            yr8.EAa(c1dy);
                            arrayList55.add(yr8);
                        }
                    } else {
                        arrayList55 = null;
                    }
                    c84483pr.A1i = arrayList55;
                    List<InterfaceC109364wL> C1y = c84483pr.C1y();
                    if (C1y != null) {
                        arrayList56 = new ArrayList(AbstractC06950Ym.A1E(C1y, 10));
                        for (InterfaceC109364wL interfaceC109364wL : C1y) {
                            interfaceC109364wL.EAZ(c1dy);
                            arrayList56.add(interfaceC109364wL);
                        }
                    } else {
                        arrayList56 = null;
                    }
                    c84483pr.A1j = arrayList56;
                    List<YQX> C1z = c84483pr.C1z();
                    if (C1z != null) {
                        arrayList57 = new ArrayList(AbstractC06950Ym.A1E(C1z, 10));
                        for (YQX yqx : C1z) {
                            yqx.E9j(c1dy);
                            arrayList57.add(yqx);
                        }
                    } else {
                        arrayList57 = null;
                    }
                    c84483pr.A1k = arrayList57;
                    List<QuestionResponsesModelIntf> C20 = c84483pr.C20();
                    if (C20 != null) {
                        arrayList58 = new ArrayList(AbstractC06950Ym.A1E(C20, 10));
                        for (QuestionResponsesModelIntf questionResponsesModelIntf : C20) {
                            questionResponsesModelIntf.EC9(c1dy);
                            arrayList58.add(questionResponsesModelIntf);
                        }
                    } else {
                        arrayList58 = null;
                    }
                    c84483pr.A1l = arrayList58;
                    List<InterfaceC73632YQu> C21 = c84483pr.C21();
                    if (C21 != null) {
                        arrayList59 = new ArrayList(AbstractC06950Ym.A1E(C21, 10));
                        for (InterfaceC73632YQu interfaceC73632YQu : C21) {
                            interfaceC73632YQu.EAb(c1dy);
                            arrayList59.add(interfaceC73632YQu);
                        }
                    } else {
                        arrayList59 = null;
                    }
                    c84483pr.A1m = arrayList59;
                    List<JMB> C23 = c84483pr.C23();
                    if (C23 != null) {
                        arrayList60 = new ArrayList(AbstractC06950Ym.A1E(C23, 10));
                        for (JMB jmb : C23) {
                            jmb.EAd(c1dy);
                            arrayList60.add(jmb);
                        }
                    } else {
                        arrayList60 = null;
                    }
                    c84483pr.A1n = arrayList60;
                    List<InterfaceC73633YQv> C24 = c84483pr.C24();
                    if (C24 != null) {
                        arrayList61 = new ArrayList(AbstractC06950Ym.A1E(C24, 10));
                        for (InterfaceC73633YQv interfaceC73633YQv : C24) {
                            interfaceC73633YQv.EAe(c1dy);
                            arrayList61.add(interfaceC73633YQv);
                        }
                    } else {
                        arrayList61 = null;
                    }
                    c84483pr.A1o = arrayList61;
                    List<InterfaceC37272GbP> C26 = c84483pr.C26();
                    if (C26 != null) {
                        arrayList62 = new ArrayList(AbstractC06950Ym.A1E(C26, 10));
                        for (InterfaceC37272GbP interfaceC37272GbP : C26) {
                            interfaceC37272GbP.EAf(c1dy);
                            arrayList62.add(interfaceC37272GbP);
                        }
                    } else {
                        arrayList62 = null;
                    }
                    c84483pr.A1p = arrayList62;
                    List<InterfaceC106104qQ> C27 = c84483pr.C27();
                    if (C27 != null) {
                        arrayList63 = new ArrayList(AbstractC06950Ym.A1E(C27, 10));
                        for (InterfaceC106104qQ interfaceC106104qQ : C27) {
                            interfaceC106104qQ.EAg(c1dy);
                            arrayList63.add(interfaceC106104qQ);
                        }
                    } else {
                        arrayList63 = null;
                    }
                    c84483pr.A1q = arrayList63;
                    List<YR7> C2B = c84483pr.C2B();
                    if (C2B != null) {
                        arrayList64 = new ArrayList(AbstractC06950Ym.A1E(C2B, 10));
                        for (YR7 yr7 : C2B) {
                            yr7.E9o(c1dy);
                            arrayList64.add(yr7);
                        }
                    } else {
                        arrayList64 = null;
                    }
                    c84483pr.A1r = arrayList64;
                    List<InterfaceC73634YQw> C2C = c84483pr.C2C();
                    if (C2C != null) {
                        arrayList65 = new ArrayList(AbstractC06950Ym.A1E(C2C, 10));
                        for (InterfaceC73634YQw interfaceC73634YQw : C2C) {
                            interfaceC73634YQw.EAh(c1dy);
                            arrayList65.add(interfaceC73634YQw);
                        }
                    } else {
                        arrayList65 = null;
                    }
                    c84483pr.A1s = arrayList65;
                    List<InterfaceC73635YQx> C2D = c84483pr.C2D();
                    if (C2D != null) {
                        arrayList66 = new ArrayList(AbstractC06950Ym.A1E(C2D, 10));
                        for (InterfaceC73635YQx interfaceC73635YQx : C2D) {
                            interfaceC73635YQx.EAi(c1dy);
                            arrayList66.add(interfaceC73635YQx);
                        }
                    } else {
                        arrayList66 = null;
                    }
                    c84483pr.A1t = arrayList66;
                    List<JMN> C2F = c84483pr.C2F();
                    if (C2F != null) {
                        arrayList67 = new ArrayList(AbstractC06950Ym.A1E(C2F, 10));
                        for (JMN jmn : C2F) {
                            jmn.EAk(c1dy);
                            arrayList67.add(jmn);
                        }
                    } else {
                        arrayList67 = null;
                    }
                    c84483pr.A1u = arrayList67;
                    List<InterfaceC73636YQy> C2G = c84483pr.C2G();
                    if (C2G != null) {
                        arrayList68 = new ArrayList(AbstractC06950Ym.A1E(C2G, 10));
                        for (InterfaceC73636YQy interfaceC73636YQy : C2G) {
                            interfaceC73636YQy.EAj(c1dy);
                            arrayList68.add(interfaceC73636YQy);
                        }
                    } else {
                        arrayList68 = null;
                    }
                    c84483pr.A1v = arrayList68;
                    List<StorySmbSupportStickerObject> C2H = c84483pr.C2H();
                    if (C2H != null) {
                        arrayList69 = new ArrayList(AbstractC06950Ym.A1E(C2H, 10));
                        for (StorySmbSupportStickerObject storySmbSupportStickerObject : C2H) {
                            storySmbSupportStickerObject.EAl(c1dy);
                            arrayList69.add(storySmbSupportStickerObject);
                        }
                    } else {
                        arrayList69 = null;
                    }
                    c84483pr.A1w = arrayList69;
                    List<InterfaceC109274vt> C2I = c84483pr.C2I();
                    if (C2I != null) {
                        arrayList70 = new ArrayList(AbstractC06950Ym.A1E(C2I, 10));
                        for (InterfaceC109274vt interfaceC109274vt2 : C2I) {
                            interfaceC109274vt2.E9l(c1dy);
                            arrayList70.add(interfaceC109274vt2);
                        }
                    } else {
                        arrayList70 = null;
                    }
                    c84483pr.A1x = arrayList70;
                    List<InterfaceC73637YQz> C2L = c84483pr.C2L();
                    if (C2L != null) {
                        arrayList71 = new ArrayList(AbstractC06950Ym.A1E(C2L, 10));
                        for (InterfaceC73637YQz interfaceC73637YQz : C2L) {
                            interfaceC73637YQz.EAm(c1dy);
                            arrayList71.add(interfaceC73637YQz);
                        }
                    } else {
                        arrayList71 = null;
                    }
                    c84483pr.A1y = arrayList71;
                    List<InterfaceC109274vt> C2M = c84483pr.C2M();
                    if (C2M != null) {
                        arrayList72 = new ArrayList(AbstractC06950Ym.A1E(C2M, 10));
                        for (InterfaceC109274vt interfaceC109274vt3 : C2M) {
                            interfaceC109274vt3.E9l(c1dy);
                            arrayList72.add(interfaceC109274vt3);
                        }
                    } else {
                        arrayList72 = null;
                    }
                    c84483pr.A1z = arrayList72;
                    List<InterfaceC43582JMq> C2Q = c84483pr.C2Q();
                    if (C2Q != null) {
                        arrayList73 = new ArrayList(AbstractC06950Ym.A1E(C2Q, 10));
                        for (InterfaceC43582JMq interfaceC43582JMq : C2Q) {
                            interfaceC43582JMq.EAr(c1dy);
                            arrayList73.add(interfaceC43582JMq);
                        }
                    } else {
                        arrayList73 = null;
                    }
                    c84483pr.A20 = arrayList73;
                    List<YR4> C2S = c84483pr.C2S();
                    if (C2S != null) {
                        arrayList74 = new ArrayList(AbstractC06950Ym.A1E(C2S, 10));
                        for (YR4 yr4 : C2S) {
                            yr4.EBC(c1dy);
                            arrayList74.add(yr4);
                        }
                    } else {
                        arrayList74 = null;
                    }
                    c84483pr.A21 = arrayList74;
                    List<YR2> C2T = c84483pr.C2T();
                    if (C2T != null) {
                        arrayList75 = new ArrayList(AbstractC06950Ym.A1E(C2T, 10));
                        for (YR2 yr2 : C2T) {
                            yr2.EAs(c1dy);
                            arrayList75.add(yr2);
                        }
                    } else {
                        arrayList75 = null;
                    }
                    c84483pr.A22 = arrayList75;
                    List<YR0> C3X = c84483pr.C3X();
                    if (C3X != null) {
                        arrayList76 = new ArrayList(AbstractC06950Ym.A1E(C3X, 10));
                        for (YR0 yr0 : C3X) {
                            yr0.EAo(c1dy);
                            arrayList76.add(yr0);
                        }
                    } else {
                        arrayList76 = null;
                    }
                    c84483pr.A23 = arrayList76;
                    InterfaceC102674k2 C5N = c84483pr.C5N();
                    if (C5N != null) {
                        C5N.E9q(c1dy);
                    } else {
                        C5N = null;
                    }
                    c84483pr.A0B = C5N;
                    InterfaceC99334d2 C6Y = c84483pr.C6Y();
                    if (C6Y != null) {
                        C6Y.EBZ(c1dy);
                    } else {
                        C6Y = null;
                    }
                    c84483pr.A0S = C6Y;
                    List<InterfaceC114635Ft> C6g = c84483pr.C6g();
                    if (C6g != null) {
                        arrayList77 = new ArrayList(AbstractC06950Ym.A1E(C6g, 10));
                        for (InterfaceC114635Ft interfaceC114635Ft : C6g) {
                            interfaceC114635Ft.EB5(c1dy);
                            arrayList77.add(interfaceC114635Ft);
                        }
                    } else {
                        arrayList77 = null;
                    }
                    c84483pr.A24 = arrayList77;
                    UpcomingEvent CD4 = c84483pr.CD4();
                    if (CD4 != null) {
                        CD4.ECI(c1dy);
                    } else {
                        CD4 = null;
                    }
                    c84483pr.A0W = CD4;
                    InterfaceC105004oG CDT = c84483pr.CDT();
                    if (CDT != null) {
                        CDT.EB9(c1dy);
                    } else {
                        CDT = null;
                    }
                    c84483pr.A0D = CDT;
                    ImmutablePandoUserDict immutablePandoUserDict8 = (ImmutablePandoUserDict) c84483pr.A0P.A07(ImmutablePandoUserDict.class);
                    if (immutablePandoUserDict8 != null) {
                        Parcelable.Creator creator8 = User.CREATOR;
                        user8 = AbstractC38851rI.A01(c1dy, immutablePandoUserDict8);
                    } else {
                        user8 = null;
                    }
                    c84483pr.A0e = user8;
                    InterfaceC84523py CEF = c84483pr.CEF();
                    if (CEF != null) {
                        CEF.EBB(c1dy);
                    } else {
                        CEF = null;
                    }
                    c84483pr.A0E = CEF;
                    c84483pr.A25 = c84483pr.A0P._viewers$fbandroid_java_com_instagram_feed_media_media(c1dy);
                    List<InterfaceC2042391v> CGm = c84483pr.CGm();
                    if (CGm != null) {
                        arrayList78 = new ArrayList(AbstractC06950Ym.A1E(CGm, 10));
                        for (InterfaceC2042391v interfaceC2042391v : CGm) {
                            interfaceC2042391v.E9G(c1dy);
                            arrayList78.add(interfaceC2042391v);
                        }
                    } else {
                        arrayList78 = null;
                    }
                    c84483pr.A26 = arrayList78;
                    InterfaceC43580JMo CHL = c84483pr.CHL();
                    if (CHL != null) {
                        CHL.EBD(c1dy);
                    } else {
                        CHL = null;
                    }
                    c84483pr.A0F = CHL;
                    List<WhatsAppChannelShareToIgStoryStickerTappableObject> CHY = c84483pr.CHY();
                    if (CHY != null) {
                        arrayList79 = new ArrayList(AbstractC06950Ym.A1E(CHY, 10));
                        for (WhatsAppChannelShareToIgStoryStickerTappableObject whatsAppChannelShareToIgStoryStickerTappableObject : CHY) {
                            whatsAppChannelShareToIgStoryStickerTappableObject.EBE(c1dy);
                            arrayList79.add(whatsAppChannelShareToIgStoryStickerTappableObject);
                        }
                    }
                    c84483pr.A27 = arrayList79;
                }
                AtomicBoolean atomicBoolean = C38321qM.A0i;
                String strongId = c84483pr.getStrongId();
                if (strongId == null) {
                    strongId = c84483pr.getId();
                }
                c84483pr.EVu(strongId);
                c38321qM = new C38321qM(c1dv, c84483pr);
                c38321qM.A45(CE4);
                return (C38321qM) c1dy.A00(c38321qM);
            }
        }
        AtomicBoolean atomicBoolean2 = C38321qM.A0i;
        C84483pr c84483pr2 = new C84483pr(immutablePandoMediaDict);
        String strongId2 = c84483pr2.getStrongId();
        if (strongId2 == null) {
            strongId2 = c84483pr2.getId();
        }
        c84483pr2.EVu(strongId2);
        c38321qM = new C38321qM(c1dv, c84483pr2);
        return (C38321qM) c1dy.A00(c38321qM);
    }

    public static final C38321qM A01(C1DY c1dy, ImmutablePandoMediaDict immutablePandoMediaDict) {
        C14360o3.A0B(immutablePandoMediaDict, 0);
        AtomicBoolean atomicBoolean = C38321qM.A0i;
        return (C38321qM) c1dy.A00(new C38321qM(c1dy.A00, new C84483pr(immutablePandoMediaDict).F4m(c1dy)));
    }

    public static final C38321qM A02(C38821rE c38821rE) {
        if (c38821rE == null) {
            return null;
        }
        AtomicBoolean atomicBoolean = C38321qM.A0i;
        C38321qM c38321qM = new C38321qM(new C37761pD(null), c38821rE);
        c38321qM.A45(null);
        return c38321qM;
    }

    public static final String A04(String str) {
        C14360o3.A0B(str, 0);
        return (String) AbstractC001900j.A0R(str, new String[]{"_"}, 0).get(1);
    }

    public static final String A06(String str) {
        C14360o3.A0B(str, 0);
        return (String) AbstractC001900j.A0R(str, new String[]{"_"}, 0).get(0);
    }

    public static final void A07(AnonymousClass182 anonymousClass182, C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 1);
        c38321qM.A44(null);
        AbstractC38811rD.A00(anonymousClass182, c38321qM.A0C.F4n(new C37761pD(null)));
    }

    public static final void A08(C38321qM c38321qM, IdentityHashMap identityHashMap, List list) {
        List<C38321qM> AmB;
        if (identityHashMap.put(c38321qM, true) == null && (AmB = c38321qM.A0C.AmB()) != null) {
            for (C38321qM c38321qM2 : AmB) {
                list.add(AnonymousClass001.A0g(c38321qM.getId(), " -> ", c38321qM2.getId()));
                A08(c38321qM2, identityHashMap, list);
            }
        }
    }

    public static final boolean A09(int i, List list) {
        return (list == null || list.isEmpty() || i == -1 || i >= list.size()) ? false : true;
    }

    public static final byte[] A0A(C38321qM c38321qM) {
        String A3A = c38321qM.A3A();
        if (A3A != null) {
            byte[] bytes = A3A.getBytes(C15W.A05);
            C14360o3.A07(bytes);
            return bytes;
        }
        return new byte[0];
    }

    public final C38321qM A0B(C16L c16l, boolean z) {
        return A0C(c16l, z, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bb, code lost:
    
        if (r9.A00 != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C38321qM A0C(X.C16L r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            r4 = 0
            r5 = 0
            X.1rE r6 = X.AbstractC38811rD.parseFromJson(r9)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld4 java.lang.NullPointerException -> Ld7
            if (r6 == 0) goto Le6
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C38321qM.A0i
            boolean r3 = r9 instanceof X.C07950bF
            if (r3 == 0) goto Lc3
            r0 = r9
            X.0bF r0 = (X.C07950bF) r0
            if (r0 == 0) goto Lc3
            com.instagram.common.session.UserSession r1 = r0.A01
        L15:
            X.1pD r0 = new X.1pD
            r0.<init>(r1)
            X.1qM r2 = new X.1qM
            r2.<init>(r0, r6)
            if (r3 == 0) goto Lbe
            r0 = r9
            X.0bF r0 = (X.C07950bF) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            r2.A45(r0)
        L29:
            if (r11 == 0) goto L30
            X.1rF r0 = r2.A0C
            r0.EUt(r5)
        L30:
            java.lang.String r0 = r2.getId()
            if (r0 == 0) goto Ld3
            java.lang.String r1 = r2.A2W()
            java.lang.String r0 = "-1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Ld3
            X.1rF r0 = r2.A0C
            java.lang.Boolean r0 = r0.CRM()
            if (r0 == 0) goto L50
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Ld3
        L50:
            if (r3 == 0) goto Lc6
            X.0bF r9 = (X.C07950bF) r9
            com.instagram.common.session.UserSession r6 = r9.A01
            X.1DX r3 = X.C1DW.A00(r6)
            java.lang.String r0 = r2.getId()
            X.1qM r0 = r3.A02(r0)
            if (r11 == 0) goto L6b
            if (r0 == 0) goto L6b
            X.1rF r0 = r0.A0C
            r0.Abm()
        L6b:
            X.0Tz r7 = X.C06090Tz.A05
            r0 = 36316632842244652(0x8105c90000122c, double:3.030123072553753E-306)
            boolean r0 = X.C18U.A06(r7, r6, r0)
            if (r0 == 0) goto La8
            boolean r0 = r2.A4d()
            if (r0 == 0) goto La8
            boolean r0 = r2.CdW()
            if (r0 == 0) goto La8
            boolean r0 = r2.A5M()
            if (r0 == 0) goto La8
            java.lang.String r0 = r2.A3B(r4)
            if (r0 == 0) goto La8
        L90:
            r5 = 0
        L91:
            r0 = 36327164104161621(0x810f5d00203955, double:3.036783084996032E-306)
            boolean r0 = X.C18U.A06(r7, r6, r0)
            if (r0 != 0) goto La3
            X.1Do r0 = r9.A02
            if (r0 == 0) goto La3
            r0.A01(r2)
        La3:
            X.1qM r2 = r3.A01(r2, r5, r4)
            return r2
        La8:
            X.1rF r0 = r2.A0C
            java.lang.Boolean r0 = r0.CXO()
            if (r0 == 0) goto Lb6
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L90
        Lb6:
            if (r10 == 0) goto L90
            boolean r0 = r9.A00
            r5 = 1
            if (r0 == 0) goto L91
            goto L90
        Lbe:
            r2.A45(r5)
            goto L29
        Lc3:
            r1 = r5
            goto L15
        Lc6:
            boolean r0 = r9 instanceof X.C07500aP
            if (r0 != 0) goto Ld3
            java.lang.String r1 = "media_missing_session"
            java.lang.String r0 = "Media JSON needs to be parsed using SessionAwareJsonParser"
            X.C0w9.A03(r1, r0)
            return r2
        Ld3:
            return r2
        Ld4:
            java.lang.String r2 = "array_out_of_bounds_exception"
            goto Lda
        Ld7:
            java.lang.String r2 = "null_pointer_exception"
        Lda:
            r1 = 817896653(0x30c01ccd, float:1.3978024E-9)
            X.0f6 r0 = X.C18950wb.A00
            X.0f5 r0 = r0.AEp(r2, r1)
            r0.report()
        Le6:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38801rC.A0C(X.16L, boolean, boolean):X.1qM");
    }

    public final C38321qM A0D(String str, List list) {
        C14360o3.A0B(list, 1);
        if (str == null || list.isEmpty()) {
            return null;
        }
        C38321qM c38321qM = (C38321qM) list.get(0);
        String Biv = c38321qM.Biv();
        C14360o3.A0B(Biv, 1);
        String A0T = AnonymousClass001.A0T(str, Biv, '_');
        try {
            C38821rE F4n = c38321qM.A0C.F4n(new C37761pD(null));
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            AbstractC38811rD.A00(A0A, F4n);
            A0A.close();
            C38821rE parseFromJson = AbstractC38811rD.parseFromJson(C16V.A00(stringWriter.toString()));
            C14360o3.A07(parseFromJson);
            parseFromJson.A5j = A0T;
            return A02(parseFromJson);
        } catch (IOException unused) {
            return null;
        }
    }

    public static final ExtendedImageUrl A03(ImageUrl imageUrl, ExtendedImageUrl extendedImageUrl, ImageInfo imageInfo, Integer num, int i) {
        ExtendedImageUrl extendedImageUrl2;
        if (imageUrl != null) {
            String url = imageUrl.getUrl();
            C14360o3.A07(url);
            extendedImageUrl2 = new ExtendedImageUrl(url, imageUrl.getWidth(), imageUrl.getHeight());
        } else if (imageInfo != null) {
            if (num != null) {
                extendedImageUrl2 = AbstractC40161tk.A04(imageInfo, num, Math.min(i, 1080));
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            extendedImageUrl2 = null;
        }
        if (extendedImageUrl == null) {
            return extendedImageUrl2;
        }
        return extendedImageUrl;
    }

    public static final String A05(String str) {
        if (str == null) {
            return null;
        }
        int A04 = AbstractC001900j.A04(str, '_', 0);
        if (A04 == -1) {
            return str;
        }
        String substring = str.substring(0, A04);
        C14360o3.A07(substring);
        return substring;
    }
}
