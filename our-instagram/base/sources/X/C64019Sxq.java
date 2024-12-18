package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Sxq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64019Sxq implements InterfaceC48192Ji {
    public final /* synthetic */ C150076p5 A00;
    public final /* synthetic */ SKM A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ InterfaceC16660sJ A03;

    public C64019Sxq(C150076p5 c150076p5, SKM skm, String str, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = c150076p5;
        this.A02 = str;
        this.A01 = skm;
        this.A03 = interfaceC16660sJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x014f: IGET (r0 I:X.0sJ) = (r3 I:X.Sxq) (LINE:335) X.Sxq.A03 X.0sJ, block:B:52:0x014f */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.Sxq] */
    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        ?? r3;
        try {
            C150076p5 c150076p5 = this.A00;
            if (anonymousClass436 != null) {
                String str = this.A02;
                Object Bos = anonymousClass436.Bos();
                C2JS c2js = (C2JS) Bos;
                if (c2js != null && c2js.getOptionalTreeField(0, "ar_block_metadata(block_ids:$block_ids,device_capabilities:$device_capabilities,effect_id:$effect_id,supported_compression_types:$supported_compression_types,supported_texture_formats:$supported_texture_formats)", QUJ.class, 1000779290) != null) {
                    ImmutableList.Builder builder = ImmutableList.builder();
                    C14360o3.A0A(Bos);
                    C2JS optionalTreeField = c2js.getOptionalTreeField(0, "ar_block_metadata(block_ids:$block_ids,device_capabilities:$device_capabilities,effect_id:$effect_id,supported_compression_types:$supported_compression_types,supported_texture_formats:$supported_texture_formats)", QUJ.class, 1000779290);
                    C14360o3.A0A(optionalTreeField);
                    C1LC A0I = AbstractC43592JPx.A0I(MSX.A0D(optionalTreeField, QUI.class, "blocks", 0, -590913784));
                    while (A0I.hasNext()) {
                        C2JS A0l = AbstractC25225BEi.A0l(A0I);
                        if (A0l.getOptionalStringField(0, "block_id") != null && A0l.getOptionalTreeField(1, "best_instance", QUH.class, -436609096) != null) {
                            C2JS optionalTreeField2 = A0l.getOptionalTreeField(1, "best_instance", QUH.class, -436609096);
                            C14360o3.A0A(optionalTreeField2);
                            C2JS reinterpretRequired = optionalTreeField2.reinterpretRequired(0, QQR.class, -735820653);
                            C14360o3.A07(reinterpretRequired);
                            if (reinterpretRequired.getOptionalStringField(0, "strong_id__") != null && reinterpretRequired.getOptionalTreeField(1, "packaged_file(supported_compression_types:$supported_compression_types,supported_texture_formats:$supported_texture_formats)", QQQ.class, -580457830) != null) {
                                C2JS optionalTreeField3 = reinterpretRequired.getOptionalTreeField(1, "packaged_file(supported_compression_types:$supported_compression_types,supported_texture_formats:$supported_texture_formats)", QQQ.class, -580457830);
                                C14360o3.A0A(optionalTreeField3);
                                if (optionalTreeField3.A09("cache_key") != null) {
                                    EnumC61213RhD enumC61213RhD = EnumC61213RhD.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                                    String A00 = AbstractC111324zv.A00(376);
                                    if (optionalTreeField3.getOptionalEnumField(3, A00, enumC61213RhD) != null && optionalTreeField3.getOptionalStringField(1, "uri") != null) {
                                        String optionalStringField = A0l.getOptionalStringField(0, "block_id");
                                        C14360o3.A0A(optionalStringField);
                                        C14360o3.A0A(reinterpretRequired.getOptionalStringField(0, "strong_id__"));
                                        String A09 = optionalTreeField3.A09("cache_key");
                                        C14360o3.A0A(A09);
                                        String optionalStringField2 = optionalTreeField3.getOptionalStringField(1, "uri");
                                        C14360o3.A0A(optionalStringField2);
                                        EnumC61213RhD enumC61213RhD2 = (EnumC61213RhD) optionalTreeField3.getOptionalEnumField(3, A00, enumC61213RhD);
                                        C14360o3.A0A(enumC61213RhD2);
                                        String name = enumC61213RhD2.name();
                                        optionalTreeField3.getOptionalStringField(4, "md5_hash");
                                        optionalTreeField3.getCoercedIntField(5, "filesize_bytes");
                                        AbstractC167007dF.A1D(optionalStringField, 0, A09);
                                        C14360o3.A0B(optionalStringField2, 3);
                                        C14360o3.A0B(name, 4);
                                        builder.add((Object) new SHK(optionalStringField, A09, optionalStringField2, name));
                                    }
                                }
                                throw AbstractC31175DnJ.A0V("bestInstance asset fragment is missing critical data. instance id:", reinterpretRequired.getOptionalStringField(0, "strong_id__"));
                            }
                            throw AbstractC31175DnJ.A0V("bestInstance fragment is missing critical data. block id:", A0l.getOptionalStringField(0, "block_id"));
                        }
                        throw AbstractC31175DnJ.A0V("block id/metadata is null. requested id:", str);
                    }
                    ImmutableList build = builder.build();
                    C14360o3.A07(build);
                    if (!build.isEmpty()) {
                        c150076p5.A03.put(str, build.get(0));
                        SKM skm = this.A01;
                        E e = build.get(0);
                        C14360o3.A07(e);
                        skm.A00((SHK) e);
                        return;
                    }
                    this.A03.invoke(AbstractC166987dD.A14("server responds with empty blockv5 metadata"));
                }
            }
        } catch (IllegalStateException e2) {
            r3.A03.invoke(e2);
        }
    }
}
