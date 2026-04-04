package opendota;

/**
 * Position snapshot for a single creep entity at a given game tick.
 * Emitted as part of an {@link Entry} with type="creeps", which batches all
 * live creeps at a tick into one NDJSON line to keep output volume manageable.
 *
 * Fields are public because Gson serializes by reflection over public fields.
 */
public class CreepPos {
    public Float x;
    public Float y;
    public Integer team;
    public String kind;
    public Float hp_frac;
}
