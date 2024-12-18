package X;

import com.instagram.api.schemas.AiAgentMetadataDict;
import com.instagram.api.schemas.IGAIAgentType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.VNz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC68365VNz {
    public static Map A00(AiAgentMetadataDict aiAgentMetadataDict) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (aiAgentMetadataDict.AaX() != null) {
            linkedHashMap.put("ai_agent_ent_fbid", aiAgentMetadataDict.AaX());
        }
        if (aiAgentMetadataDict.Aad() != null) {
            linkedHashMap.put("ai_agent_persona_fbid", aiAgentMetadataDict.Aad());
        }
        if (aiAgentMetadataDict.Aah() != null) {
            IGAIAgentType Aah = aiAgentMetadataDict.Aah();
            if (Aah != null) {
                str = Aah.A00;
            } else {
                str = null;
            }
            linkedHashMap.put("ai_agent_type", str);
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
